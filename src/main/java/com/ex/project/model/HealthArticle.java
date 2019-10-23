package com.ex.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class HealthArticle {

    private Integer hId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date insertTime;

    private Integer mId;

    private String context;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}