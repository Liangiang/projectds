package com.ex.project.controller;

import com.ex.project.model.OrderInfo;
import com.ex.project.service.OrderInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/order")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    /**
     * @return int
     * @Author lx
     * @Description 增
     * @Date 16:37 2019/10/23
     * @Param [orderInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add_order(@RequestBody OrderInfo orderInfo) {
        int returnData = orderInfoService.add_order(orderInfo);
        return returnData;
    }

    @ResponseBody
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public int del_order(@RequestBody OrderInfo orderInfo) {
        int returnData = orderInfoService.del_order(orderInfo);
        return returnData;
    }
    /**
     * @return int
     * @Author lx
     * @Description 改（付款，发货，收货，取消订单，申请退货，同意退货，拒绝退货）
     * @Date 16:44 2019/10/23
     * @Param [orderInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/up", method = RequestMethod.POST)
    public int up_order(@RequestBody OrderInfo orderInfo) {
        int returnData = orderInfoService.up_order(orderInfo);
        return returnData;
    }

    /**
     * @return com.ex.project.model.OrderInfo
     * @Author lx
     * @Description 查（一个订单）
     * @Date 16:54 2019/10/23
     * @Param [orderInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/selA", method = RequestMethod.POST)
    public OrderInfo sel_a_order(@RequestBody OrderInfo orderInfo) {
        OrderInfo returnData = orderInfoService.sel_a_order(orderInfo);
        return returnData;
    }

    /**
     * @return com.ex.project.model.OrderInfo
     * @Author lx
     * @Description 查订单（所有）u-查看该用户所有订单||s-查看该店铺所有订单||m-管理员查看所有订单
     * @Date 16:54 2019/10/23
     * @Param [orderInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/selAll", method = RequestMethod.POST)
    public PageInfo<OrderInfo> sel_all_order(@RequestBody OrderInfo orderInfo) {
        PageInfo<OrderInfo> returnData = orderInfoService.sel_all_order(orderInfo);
        return returnData;
    }
}
