package com.zhuhao.eshop.mapper;

import com.zhuhao.eshop.entity.Product;
import com.zhuhao.eshop.entity.Stock;
import org.springframework.stereotype.Repository;

/**
 * mybatis mapper --> UserMapper.xml
 * 为service层 提供数据
 */
@Repository
public interface StockMapper {
    /*
     * 根据商品ID 查询库存信息
     */
    Stock selectStockByPId(Product product);

}