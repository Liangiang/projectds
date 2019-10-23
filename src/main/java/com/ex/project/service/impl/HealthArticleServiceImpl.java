package com.ex.project.service.impl;

import com.ex.project.mapper.HealthArticleMapper;
import com.ex.project.service.HealthArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HealthArticleServiceImpl implements HealthArticleService {

    @Resource
    private HealthArticleMapper healthArticleMapper;
}
