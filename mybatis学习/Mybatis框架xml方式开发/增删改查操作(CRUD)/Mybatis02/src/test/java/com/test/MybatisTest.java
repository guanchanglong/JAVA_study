package com.test;

import com.dao.UserDao;
import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

public class MybatisTest {
    private static UserDao userDao;
    private static SqlSession session;
    private static InputStream inputStream;
    public void test() throws Exception{
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        session = factory.openSession();
        userDao = session.getMapper(UserDao.class);
    }
    public void testFindAll(){                  //普通查询操作
        List<User>users = userDao.findAll();
        for (User user:users){
            System.out.println(user);
        }
    }
    public void testAddUser(){                  //增添操作
        User user = new User();
        user.setProduct_name("钢琴");
        user.setProduct_type("乐器");
        user.setProduct_price(30000);
        try{
            user.setRegist_date(new SimpleDateFormat("yyyy-MM-dd").parse("2020-7-16"));
        }catch (Exception e){
            e.printStackTrace();
        }
        userDao.addUser(user);
        session.commit();
//      若没有写session.commit();则更新的数据没有进行更新
//      进行add和update必须进行session.commit();
    }
    public void testDelete(){                   //删除操作
        userDao.deleteUserByType("乐器");
        session.commit();
    }
    public void testUpdate(){                   //修改操作
        User user = new User();
        user.setProduct_type("乐器");
        user.setProduct_name("吉他");
        user.setProduct_price(10000);
        try{
            user.setRegist_date(new SimpleDateFormat("yyyy-MM-dd").parse("2020-7-16"));
        }catch (Exception e){
            e.printStackTrace();
        }
        userDao.updateUser(user);
        session.commit();
    }
    public void testFindByType(){               //模糊查询操作
        List<User>userList = userDao.findByType("%用品%");
        for (User user:userList){
            System.out.println(user);
        }
    }
    public void destroy() throws Exception{     //资源关闭操作
        session.close();
        inputStream.close();
    }
    public static void main(String[]args)throws Exception{
        MybatisTest mybatisTest = new MybatisTest();
        mybatisTest.test();
        mybatisTest.testFindByType();
        mybatisTest.destroy();
    }
}
