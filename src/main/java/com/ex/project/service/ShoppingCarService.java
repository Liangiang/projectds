package com.ex.project.service;

import com.ex.project.model.ShoppingCarInfo;

import com.github.pagehelper.PageInfo;

import java.util.Map;


public interface ShoppingCarService {
    int add_shopping(ShoppingCarInfo shoppingCar);

    int del_shopping(ShoppingCarInfo shoppingCar);

    int up_shopping(ShoppingCarInfo shoppingCar);

    PageInfo<ShoppingCarInfo> sel_shopping(Map map);
}
