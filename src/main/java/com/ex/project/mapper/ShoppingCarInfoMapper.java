package com.ex.project.mapper;

import com.ex.project.model.ShoppingCarInfo;

import java.util.List;

public interface ShoppingCarInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCarInfo record);

    int insertSelective(ShoppingCarInfo record);

    ShoppingCarInfo selectByPrimaryKey(Integer id);

    List<ShoppingCarInfo> selectByUId();

    int updateByPrimaryKeySelective(ShoppingCarInfo record);

    int updateByPrimaryKey(ShoppingCarInfo record);
}