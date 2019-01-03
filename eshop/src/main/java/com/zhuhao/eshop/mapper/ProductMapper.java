package com.zhuhao.eshop.mapper;

import com.zhuhao.eshop.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * mybatis mapper --> UserMapper.xml
 * 为service层 提供数据
 */
@Repository
public interface ProductMapper {
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