package com.ex.project.controller;

import com.ex.project.model.GoodsInfo;
import com.ex.project.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/goods")
public class GoodsInfoController {

    @Autowired
    private GoodsInfoService goodsInfoServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/add_goods", method = RequestMethod.POST)
    public int add_goods(@RequestBody GoodsInfo goodsInfo) {
        int returnData = goodsInfoServiceImpl.add_goods(goodsInfo);
        return returnData;
    }

}
