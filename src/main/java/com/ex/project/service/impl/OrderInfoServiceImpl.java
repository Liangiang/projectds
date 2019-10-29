package com.ex.project.service.impl;

import com.ex.project.mapper.GoodsInfoMapper;
import com.ex.project.mapper.OrderInfoMapper;
import com.ex.project.model.GoodsInfo;
import com.ex.project.model.OrderInfo;
import com.ex.project.service.OrderInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Resource
    private OrderInfoMapper orderInfoMapper;
    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public int add_order(OrderInfo orderInfo) {
        GoodsInfo g = goodsInfoMapper.selectByPrimaryKey(orderInfo.getgId());
        orderInfo.setsId(g.getsId());
        int returnData = orderInfoMapper.insertSelective(orderInfo);
        return returnData;
    }

    @Override
    public int del_order(OrderInfo orderInfo) {
        int returnData = orderInfoMapper.deleteByPrimaryKey(orderInfo.getoId());
        return returnData;
    }

    @Override
    public int up_order(OrderInfo orderInfo) {
        int returnData = orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
        return returnData;
    }

    @Override
    public OrderInfo sel_a_order(OrderInfo orderInfo) {
        OrderInfo returnData = orderInfoMapper.selectByPrimaryKey(orderInfo.getoId());
        return returnData;
    }

    @Override
    public PageInfo<OrderInfo> sel_all_order(OrderInfo orderInfo) {
        PageHelper.startPage(orderInfo.getCurrentPage(), orderInfo.getPageSize());
        List<OrderInfo> a = orderInfoMapper.selAllOrderBy(orderInfo);
        PageInfo<OrderInfo> returnData = new PageInfo<>(a);
        return returnData;
    }

}
