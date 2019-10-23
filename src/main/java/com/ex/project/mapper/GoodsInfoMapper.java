package com.ex.project.mapper;

import com.ex.project.model.GoodsInfo;

import java.util.List;

public interface GoodsInfoMapper {

    List<GoodsInfo> selGoodsBy(GoodsInfo record);

    int deleteByPrimaryKey(Integer gId);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);
}