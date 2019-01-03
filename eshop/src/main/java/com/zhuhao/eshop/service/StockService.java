package com.zhuhao.eshop.service;

import com.zhuhao.eshop.entity.Product;
import com.zhuhao.eshop.entity.Stock;
import org.springframework.stereotype.Repository;


public interface StockService {
    /*
     * 根据商品ID 查询库存信息
     */
    Stock selectStockByPId(Product product);
}
