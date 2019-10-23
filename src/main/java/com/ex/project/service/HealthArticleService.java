package com.ex.project.service;

import com.ex.project.model.HealthArticle;
import com.github.pagehelper.PageInfo;

public interface HealthArticleService {

    PageInfo<HealthArticle> sel_all_article(HealthArticle healthArticle);

    int add_article(HealthArticle healthArticle);

    int del_article(HealthArticle healthArticle);

    int up_article(HealthArticle healthArticle);

    HealthArticle sel_a_article(HealthArticle healthArticle);
}
