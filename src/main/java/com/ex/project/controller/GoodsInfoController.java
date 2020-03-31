package com.ex.project.controller;

import com.ex.project.model.GoodsInfo;
import com.ex.project.service.GoodsInfoService;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/goods")
public class GoodsInfoController {

    @Autowired
    private GoodsInfoService goodsInfoServiceImpl;
    @Value("${save.path}")
    private String filePath;

    /**
     * @return com.github.pagehelper.PageInfo<com.ex.project.model.GoodsInfo>
     * @Author lx
     * @Description 查看所有已上架的商品or查看本店铺所有商品
     * @Date 16:35 2019/10/23
     * @Param [goodsInfo]
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
     * @return java.util.Map<java.lang.String                                                               ,                                                               java.lang.Object>
     * @Author lx
     * @Description 上传主图
     * @Date 20:33 2019/10/29
     * @Param [file]
     **/
    @RequestMapping(value = "/saveImage", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> upload(@RequestBody MultipartFile file) throws Exception {
        Map<String, Object> resultMap = new HashMap<>();
        try {
            // 文件名
            String fileName = file.getOriginalFilename();
            // 后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            // 上传后的路径
            //String filePath = "E:/Ahtah/CompanySvn/bishe/bisheUI/static/img/goodsImg/";
            // 新文件名
            fileName = UUID.randomUUID() + suffixName;
            File dest = new File(filePath + fileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            //保存方法
            file.transferTo(dest);

            resultMap.put("filePath", "/static/img/goodsImg/" + fileName);
            resultMap.put("code", 200);
            resultMap.put("message", "上传成功");
            resultMap.put("upTime", new Date());
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "上传异常！");
        }

        return resultMap;
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
