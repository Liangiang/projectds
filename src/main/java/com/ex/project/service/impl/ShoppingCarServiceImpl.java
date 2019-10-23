package com.ex.project.service.impl;

import com.ex.project.mapper.ShopInfoMapper;
import com.ex.project.mapper.ShoppingCarInfoMapper;
import com.ex.project.model.ShoppingCarInfo;
import com.ex.project.service.ShoppingCarService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ShoppingCarServiceImpl implements ShoppingCarService {
    @Resource
    private ShoppingCarInfoMapper shoppingCarInfoMapper;

    @Override
    public int add_shopping(ShoppingCarInfo shoppingCar) {
        int returnData = 0;
        ShoppingCarInfo re = shoppingCarInfoMapper.selectByGId(shoppingCar);
        //之前是否加过购物车
        if (re != null) {
            int shopnum = shoppingCar.getPurchaseNum();
            shoppingCar.setPurchaseNum(shopnum + re.getPurchaseNum());
            returnData = shoppingCarInfoMapper.updateByPrimaryKeySelective(shoppingCar);
        } else {
            returnData = shoppingCarInfoMapper.insertSelective(shoppingCar);
        }
        return returnData;
    }

    @Override
    public int del_shopping(ShoppingCarInfo shoppingCar) {
        int returnData = shoppingCarInfoMapper.deleteByPrimaryKey(shoppingCar.getId());
        return returnData;
    }

    @Override
    public int up_shopping(ShoppingCarInfo shoppingCar) {
        int returnData = shoppingCarInfoMapper.updateByPrimaryKeySelective(shoppingCar);
        return returnData;
    }

    @Override
    public PageInfo<ShoppingCarInfo> sel_shopping(Map remap) {
        List<ShoppingCarInfo> returnData = shoppingCarInfoMapper.selectByUId();
        PageHelper.startPage(Integer.parseInt(remap.get("currentPage").toString()), Integer.parseInt(remap.get("pageSize").toString()));
        PageInfo<ShoppingCarInfo> a = new PageInfo<ShoppingCarInfo>(returnData);
        return a;
    }

}
