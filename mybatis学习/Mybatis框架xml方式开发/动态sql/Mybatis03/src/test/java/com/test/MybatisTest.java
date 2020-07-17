package com.test;

import com.dao.ProductDao;
import com.domain.Product;
import com.domain.QueryProduct;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
    private static InputStream inputStream;
    private static ProductDao productDao;
    private static SqlSession session;
    public void test()throws  Exception{
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        session = factory.openSession();
        productDao = session.getMapper(ProductDao.class);
    }
    public void testFindByType(){
        Product product = new Product();
        product.setProduct_type("乐器");
        System.out.println(productDao.findByType(product));
    }
    public void testFindByProduct(){
        Product product = new Product();
        product.setProduct_type("%用品%");
        product.setProduct_price(100);
        List<Product>productList = productDao.findByProduct(product);
        for (Product product1:productList){
            System.out.println(product1);
        }
    }
    public void testFindByType2(){
        Product product = new Product();
        QueryProduct queryProduct = new QueryProduct();
        List<String>list = new ArrayList<>();
        list.add("生活用品");
        list.add("乐器");
        list.add("文具");
        queryProduct.setP_type(list);
        List<Product>productList = productDao.findByType2(queryProduct);
        for (Product product1:productList){
            System.out.println(product1);
        }
    }
    public void destroy()throws Exception{
        session.close();
        inputStream.close();
    }
    public static void main(String[]args)throws Exception{
        MybatisTest mybatisTest = new MybatisTest();
        mybatisTest.test();
        mybatisTest.testFindByType2();
        mybatisTest.destroy();
    }
}
