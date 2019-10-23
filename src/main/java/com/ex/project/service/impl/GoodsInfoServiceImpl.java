package com.ex.project.service.impl;

import com.ex.project.mapper.GoodsInfoMapper;
import com.ex.project.model.GoodsInfo;
import com.ex.project.service.GoodsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public int add_goods(GoodsInfo goodsInfo) {
        int returnData = goodsInfoMapper.insertSelective(goodsInfo);
        return returnData;
    }
}
