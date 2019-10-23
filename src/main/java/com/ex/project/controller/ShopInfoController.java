package com.ex.project.controller;

import com.ex.project.model.ShopInfo;
import com.ex.project.service.ShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/shop")
public class ShopInfoController {
    @Autowired
    private ShopInfoService shopInfoService;

    /**
     * @return int
     * @Author lx
     * @Description
     * @Date 14:19 2019/10/23
     * @Param [shopInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/add_shop", method = RequestMethod.POST)
    public int add_shop(@RequestBody ShopInfo shopInfo) {
        int returnData = shopInfoService.add_shop(shopInfo);
        return returnData;
    }

}
