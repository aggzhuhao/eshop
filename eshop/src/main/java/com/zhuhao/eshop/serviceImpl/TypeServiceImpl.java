package com.zhuhao.eshop.serviceImpl;

import com.zhuhao.eshop.entity.Type;
import com.zhuhao.eshop.mapper.TypeMapper;
import com.zhuhao.eshop.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper typeMapper;

    public List<Type> selectAllType() {
        return typeMapper.selectAllType();
    }
}
