package com.zhuhao.eshop.service;

import com.zhuhao.eshop.entity.Product;

import java.util.List;

public interface ProductService {
    /*
     * 查询所有的产品
     */
    List<Product> selectAllProduct();
    /*
     * 首页查询前10 条数据
     */
    List<Product> selectProductLimit();
    /*
     * 根据产品的ID查询该产品的详细信息
     */
    Product selectProductById(Product product);
    /*
     * 模糊查询有的关键字的产品
     */
    List<Product> selectlikeProduct(String description);
}
