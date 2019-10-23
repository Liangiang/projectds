package com.ex.project.controller;

import com.ex.project.model.ShoppingCarInfo;
import com.ex.project.service.ShoppingCarService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("/shoppingCar")
public class ShoppingCarController {

    @Autowired
    private ShoppingCarService shoppingCarServiceImpl;

    /**
     * @return int
     * @Author lx
     * @Description 加入购物车（增）
     * @Date 17:17 2019/10/23
     * @Param [shoppingCar]
     **/
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add_shopping(@RequestBody ShoppingCarInfo shoppingCar) {
        System.out.print(shoppingCar);
        int returnData = shoppingCarServiceImpl.add_shopping(shoppingCar);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 删
     * @Date 9:53 2019/10/23
     * @Param [shoppingCar]
     **/
    @ResponseBody
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public int del_shopping(@RequestBody ShoppingCarInfo shoppingCar) {
        System.out.print(shoppingCar);
        int returnData = shoppingCarServiceImpl.del_shopping(shoppingCar);
        return returnData;
    }

    /**
     * @return
     * @Author lx
     * @Description 改
     * @Date 9:55 2019/10/23
     * @Param
     **/
    @ResponseBody
    @RequestMapping(value = "/up", method = RequestMethod.POST)
    public int up_shopping(@RequestBody ShoppingCarInfo shoppingCar) {
        System.out.print(shoppingCar);
        int returnData = shoppingCarServiceImpl.up_shopping(shoppingCar);
        return returnData;
    }

    /**
     * @return
     * @Author lx
     * @Description 查
     * @Date 14:06 2019/10/23
     * @Param []
     **/
    @ResponseBody
    @RequestMapping(value = "/sel", method = RequestMethod.POST)
    public PageInfo<ShoppingCarInfo> sel_shopping(@RequestBody Map map) {
        PageInfo<ShoppingCarInfo> returnData = shoppingCarServiceImpl.sel_shopping(map);
        return returnData;
    }
}
