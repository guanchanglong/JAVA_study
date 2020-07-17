package com.dao;

import com.domain.Product;
import com.domain.QueryProduct;

import java.util.List;

public interface ProductDao {
    /**
     * 根据类型来查找
     * @param product
     * @return
     */
    Product findByType(Product product);
    /**
     *根据多个信息查询
     * @param product
     * @return
     */
    List<Product>findByProduct(Product product);
    /**
     * 根据多个类型查询
     * @param queryProduct
     * @return
     */
    List<Product>findByType2(QueryProduct queryProduct);
}
