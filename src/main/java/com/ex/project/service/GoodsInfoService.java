package com.ex.project.service;

import com.ex.project.model.GoodsInfo;
import com.github.pagehelper.PageInfo;


public interface GoodsInfoService {

    PageInfo<GoodsInfo> selGoodsBy(GoodsInfo goodsInfo);

    int add_goods(GoodsInfo goodsInfo);

    int del_goods(GoodsInfo goodsInfo);

    int up_goods(GoodsInfo goodsInfo);

    GoodsInfo sel_goods(GoodsInfo goodsInfo);
}
