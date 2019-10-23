package com.ex.project.mapper;

import com.ex.project.model.GoodsInfo;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);
}