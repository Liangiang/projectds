package com.ex.project.service;

import com.ex.project.model.OrderInfo;
import com.github.pagehelper.PageInfo;

public interface OrderInfoService {

    int add_order(OrderInfo orderInfo);

    int up_order(OrderInfo orderInfo);

    OrderInfo sel_a_order(OrderInfo orderInfo);

    PageInfo<OrderInfo> sel_all_order(OrderInfo orderInfo);
}
