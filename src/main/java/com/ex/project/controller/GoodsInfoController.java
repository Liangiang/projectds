package com.ex.project.controller;

import com.ex.project.model.GoodsInfo;
import com.ex.project.service.GoodsInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/goods")
public class GoodsInfoController {

    @Autowired
    private GoodsInfoService goodsInfoServiceImpl;

/**
 * @Author lx
 * @Description  查看所有已上架的商品or查看本店铺所有商品
 * @Date 16:35 2019/10/23
 * @Param [goodsInfo]
 * @return com.github.pagehelper.PageInfo<com.ex.project.model.GoodsInfo>
 **/
    @ResponseBody
    @RequestMapping(value = "/selGoodsBy", method = RequestMethod.POST)
    public PageInfo<GoodsInfo> selGoodsBy(@RequestBody GoodsInfo goodsInfo) {
        PageInfo<GoodsInfo> returnData = goodsInfoServiceImpl.selGoodsBy(goodsInfo);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 增
     * @Date 15:31 2019/10/23
     * @Param [goodsInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/add_goods", method = RequestMethod.POST)
    public int add_goods(@RequestBody GoodsInfo goodsInfo) {
        int returnData = goodsInfoServiceImpl.add_goods(goodsInfo);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 删
     * @Date 15:33 2019/10/23
     * @Param [goodsInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/del_goods", method = RequestMethod.POST)
    public int del_goods(@RequestBody GoodsInfo goodsInfo) {
        int returnData = goodsInfoServiceImpl.del_goods(goodsInfo);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 改
     * @Date 15:34 2019/10/23
     * @Param [goodsInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/up_goods", method = RequestMethod.POST)
    public int up_goods(@RequestBody GoodsInfo goodsInfo) {
        int returnData = goodsInfoServiceImpl.up_goods(goodsInfo);
        return returnData;
    }

    /**
     * @return com.ex.project.model.GoodsInfo
     * @Author lx
     * @Description 查-通过id
     * @Date 15:35 2019/10/23
     * @Param [goodsInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/sel_goods", method = RequestMethod.POST)
    public GoodsInfo sel_goods(@RequestBody GoodsInfo goodsInfo) {
        GoodsInfo returnData = goodsInfoServiceImpl.sel_goods(goodsInfo);
        return returnData;
    }


}
