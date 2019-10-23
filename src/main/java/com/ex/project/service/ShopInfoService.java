package com.ex.project.service;

import com.ex.project.model.ShopInfo;

import java.util.Map;

public interface ShopInfoService {
    Map login_shop(ShopInfo shopInfo);

    int add_shop(ShopInfo shopInfo);

    int up_shop(ShopInfo shopInfo);

    ShopInfo sel_shop(ShopInfo shopInfo);

}
