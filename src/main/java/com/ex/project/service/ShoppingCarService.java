package com.ex.project.service;

import com.ex.project.model.ShoppingCarInfo;

import com.ex.project.model.ShoppingCarInfoVO;
import com.github.pagehelper.PageInfo;

import java.util.Map;


public interface ShoppingCarService {
    int add_shopping(ShoppingCarInfo shoppingCar);

    int del_shopping(ShoppingCarInfo shoppingCar);

    int up_shopping(ShoppingCarInfo shoppingCar);

    PageInfo<ShoppingCarInfoVO> sel_shopping(Map map);
}
