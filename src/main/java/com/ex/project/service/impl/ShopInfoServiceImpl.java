package com.ex.project.service.impl;

import com.ex.project.mapper.ShopInfoMapper;
import com.ex.project.model.ShopInfo;
import com.ex.project.service.ShopInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopInfoServiceImpl implements ShopInfoService {
    @Resource
    private ShopInfoMapper shopInfoMapper;

    @Override
    public int add_shop(ShopInfo shopInfo) {
        int returnData = shopInfoMapper.insertSelective(shopInfo);
        return returnData;
    }
}
