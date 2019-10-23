package com.ex.project.mapper;

import com.ex.project.model.ShoppingCarInfo;

public interface ShoppingCarInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCarInfo record);

    int insertSelective(ShoppingCarInfo record);

    ShoppingCarInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCarInfo record);

    int updateByPrimaryKey(ShoppingCarInfo record);
}