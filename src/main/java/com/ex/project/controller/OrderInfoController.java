package com.ex.project.controller;

import com.ex.project.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/order")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;


}
