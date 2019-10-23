package com.ex.project.controller;

import com.ex.project.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/goods")
public class GoodsInfoController {

    @Autowired
    private GoodsInfoService goodsInfoServiceImpl;

}
