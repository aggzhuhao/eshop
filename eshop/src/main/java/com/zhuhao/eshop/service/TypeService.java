package com.zhuhao.eshop.service;

import com.zhuhao.eshop.entity.Type;

import java.util.List;

public interface TypeService {
    //查询所有的种类
    public List<Type> selectAllType();
}
