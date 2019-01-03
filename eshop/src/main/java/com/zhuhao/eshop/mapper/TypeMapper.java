package com.zhuhao.eshop.mapper;

import com.zhuhao.eshop.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mybatis mapper --> UserMapper.xml
 * 为service层 提供数据
 */
@Repository
public interface TypeMapper {
    //查询所有的种类
    public List<Type> selectAllType();
}
