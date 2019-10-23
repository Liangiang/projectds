package com.ex.project.mapper;

import com.ex.project.model.HealthArticle;

public interface HealthArticleMapper {
    int deleteByPrimaryKey(Integer hId);

    int insert(HealthArticle record);

    int insertSelective(HealthArticle record);

    HealthArticle selectByPrimaryKey(Integer hId);

    int updateByPrimaryKeySelective(HealthArticle record);

    int updateByPrimaryKeyWithBLOBs(HealthArticle record);

    int updateByPrimaryKey(HealthArticle record);
}