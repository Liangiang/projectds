package com.ex.project.service.impl;

import com.ex.project.mapper.GoodsInfoMapper;
import com.ex.project.model.GoodsInfo;
import com.ex.project.service.GoodsInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public PageInfo<GoodsInfo> selGoodsBy(GoodsInfo goodsInfo) {
        List<GoodsInfo> a = goodsInfoMapper.selGoodsBy(goodsInfo);
        PageHelper.startPage(goodsInfo.getCurrentPage(), goodsInfo.getPageSize());
        PageInfo<GoodsInfo> returnData = new PageInfo<>(a);
        return returnData;
    }

    @Override
    public int add_goods(GoodsInfo goodsInfo) {
        int returnData = goodsInfoMapper.insertSelective(goodsInfo);
        return returnData;
    }

    @Override
    public int del_goods(GoodsInfo goodsInfo) {
        int returnData = goodsInfoMapper.deleteByPrimaryKey(goodsInfo.getgId());
        return returnData;
    }

    @Override
    public int up_goods(GoodsInfo goodsInfo) {
        int returnData = goodsInfoMapper.updateByPrimaryKeySelective(goodsInfo);
        return returnData;
    }

    @Override
    public GoodsInfo sel_goods(GoodsInfo goodsInfo) {
        GoodsInfo returnData = goodsInfoMapper.selectByPrimaryKey(goodsInfo.getgId());
        return returnData;
    }
}
