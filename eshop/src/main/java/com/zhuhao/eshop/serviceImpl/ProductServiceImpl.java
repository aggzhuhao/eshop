package com.zhuhao.eshop.serviceImpl;

import com.zhuhao.eshop.entity.Product;
import com.zhuhao.eshop.mapper.ProductMapper;
import com.zhuhao.eshop.mapper.StockMapper;
import com.zhuhao.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;


    public List<Product> selectAllProduct() {
        return productMapper.selectAllProduct();
    }

    public List<Product> selectProductLimit() {
        return productMapper.selectProductLimit();
    }

    public Product selectProductById(Product product) {
        return productMapper.selectProductById(product);
    }


    public List<Product> selectlikeProduct(String description) {
        return productMapper.selectlikeProduct(description);
    }
}
