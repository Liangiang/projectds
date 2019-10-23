package com.ex.project.controller;

import com.ex.project.model.HealthArticle;
import com.ex.project.service.HealthArticleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/health")
public class HealthArticleController {

    @Autowired
    private HealthArticleService healthArticleService;

    /**
     * @return int
     * @Author lx
     * @Description 查所有（管理员&&用户）
     * @Date 23:34 2019/10/23
     * @Param [healthArticle]
     **/
    @ResponseBody
    @RequestMapping(value = "/selAll", method = RequestMethod.POST)
    public PageInfo<HealthArticle> sel_all_article(@RequestBody HealthArticle healthArticle) {
        PageInfo<HealthArticle> returnData = healthArticleService.sel_all_article(healthArticle);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 增
     * @Date 19:37 2019/10/23
     * @Param [shopInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add_article(@RequestBody HealthArticle healthArticle) {
        int returnData = healthArticleService.add_article(healthArticle);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 删
     * @Date 23:28 2019/10/23
     * @Param [healthArticle]
     **/
    @ResponseBody
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public int del_article(@RequestBody HealthArticle healthArticle) {
        int returnData = healthArticleService.del_article(healthArticle);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 改
     * @Date 23:34 2019/10/23
     * @Param [healthArticle]
     **/
    @ResponseBody
    @RequestMapping(value = "/up", method = RequestMethod.POST)
    public int up_article(@RequestBody HealthArticle healthArticle) {
        int returnData = healthArticleService.up_article(healthArticle);
        return returnData;
    }

    /**
     * @return com.ex.project.model.HealthArticle
     * @Author lx
     * @Description 查（one一个）
     * @Date 0:05 2019/10/24
     * @Param [healthArticle]
     **/
    @ResponseBody
    @RequestMapping(value = "/selA", method = RequestMethod.POST)
    public HealthArticle sel_a_article(@RequestBody HealthArticle healthArticle) {
        HealthArticle returnData = healthArticleService.sel_a_article(healthArticle);
        return returnData;
    }
}
