package com.ex.project.controller;

import com.ex.project.model.ShopInfo;
import com.ex.project.service.ShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("/shop")
public class ShopInfoController {

    @Autowired
    private ShopInfoService shopInfoService;

    /**
     * @return int
     * @Author lx
     * @Description 登录
     * @Date 14:29 2019/10/23
     * @Param [shopInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map login_shop(@RequestBody ShopInfo shopInfo) {
        Map returnData = shopInfoService.login_shop(shopInfo);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 增
     * @Date 14:19 2019/10/23
     * @Param [shopInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add_shop(@RequestBody ShopInfo shopInfo) {
        int returnData = shopInfoService.add_shop(shopInfo);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 改
     * @Date 14:25 2019/10/23
     * @Param [shopInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/up", method = RequestMethod.POST)
    public int up_shop(@RequestBody ShopInfo shopInfo) {
        int returnData = shopInfoService.up_shop(shopInfo);
        return returnData;
    }

    /**
     * @return com.ex.project.model.ShopInfo
     * @Author lx
     * @Description 查
     * @Date 14:28 2019/10/23
     * @Param [shopInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/sel", method = RequestMethod.POST)
    public ShopInfo sel_shop(@RequestBody ShopInfo shopInfo) {
        ShopInfo returnData = shopInfoService.sel_shop(shopInfo);
        return returnData;
    }
}
