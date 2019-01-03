package com.zhuhao.eshop.serviceImpl;

import com.zhuhao.eshop.entity.Product;
import com.zhuhao.eshop.entity.Stock;
import com.zhuhao.eshop.mapper.StockMapper;
import com.zhuhao.eshop.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockMapper stockMapper;

    @Override
    public Stock selectStockByPId(Product product) {
        return stockMapper.selectStockByPId(product);
    }
}
