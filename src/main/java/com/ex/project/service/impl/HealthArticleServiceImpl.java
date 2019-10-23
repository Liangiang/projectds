package com.ex.project.service.impl;

import com.ex.project.mapper.HealthArticleMapper;
import com.ex.project.model.HealthArticle;
import com.ex.project.service.HealthArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HealthArticleServiceImpl implements HealthArticleService {

    @Resource
    private HealthArticleMapper healthArticleMapper;

    @Override
    public PageInfo<HealthArticle> sel_all_article(HealthArticle healthArticle) {
        List<HealthArticle> a = healthArticleMapper.selAllArticleBy(healthArticle);
        PageHelper.startPage(healthArticle.getCurrentPage(), healthArticle.getPageSize());
        PageInfo<HealthArticle> returnData = new PageInfo<>(a);
        return returnData;
    }

    @Override
    public int add_article(HealthArticle healthArticle) {
        int returnData = healthArticleMapper.insertSelective(healthArticle);
        return returnData;
    }

    @Override
    public int del_article(HealthArticle healthArticle) {
        int returnData = healthArticleMapper.deleteByPrimaryKey(healthArticle.gethId());
        return returnData;
    }

    @Override
    public int up_article(HealthArticle healthArticle) {
        int returnData = healthArticleMapper.updateByPrimaryKeySelective(healthArticle);
        return returnData;
    }

    @Override
    public HealthArticle sel_a_article(HealthArticle healthArticle) {
        HealthArticle returnData = healthArticleMapper.selectByPrimaryKey(healthArticle.gethId());
        return returnData;
    }
}
