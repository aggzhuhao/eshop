package com.zhuhao.eshop.mapper;

import com.zhuhao.eshop.entity.Category;
import com.zhuhao.eshop.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mybatis mapper --> UserMapper.xml
 * 为service层 提供数据
 */
@Repository
public interface CategoryMapper {
    /*
     * 查询所有的产品的类型
     */
    List<Category> selectAllCategory();
    /*
     * 根据种类的编号 查询所有该种类的产品
     */
    List<Product> selectproductByCategoryId(int categoryId);
    /*
     * 根据种类的编号 查询该种类的名称
     */
    Category selectBycategoryId(int categoryId);
}