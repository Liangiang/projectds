package com.ex.project.controller;

import com.ex.project.service.HealthArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/health")
public class HealthArticleController {

    @Autowired
    private HealthArticleService healthArticleService;
}
