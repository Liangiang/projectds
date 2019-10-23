package com.ex.project.model;

import java.util.Date;

public class GoodsInfo {
    private Integer gId;

    private Integer sId;

    private String gName;

    private String gBrand;

    private Double price;

    private Integer gStock;

    private String typeName;

    private String mainEffect;

    private String imgUrl;

    private String gTitle;

    private String produceArea;

    private String gNorm;

    private String gShelfLife;

    private Integer downFlag;

    private Date publishTime;

    private Integer currentPage;

    private Integer pageSize;


    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgBrand() {
        return gBrand;
    }

    public void setgBrand(String gBrand) {
        this.gBrand = gBrand == null ? null : gBrand.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getgStock() {
        return gStock;
    }

    public void setgStock(Integer gStock) {
        this.gStock = gStock;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getMainEffect() {
        return mainEffect;
    }

    public void setMainEffect(String mainEffect) {
        this.mainEffect = mainEffect == null ? null : mainEffect.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getgTitle() {
        return gTitle;
    }

    public void setgTitle(String gTitle) {
        this.gTitle = gTitle == null ? null : gTitle.trim();
    }

    public String getProduceArea() {
        return produceArea;
    }

    public void setProduceArea(String produceArea) {
        this.produceArea = produceArea == null ? null : produceArea.trim();
    }

    public String getgNorm() {
        return gNorm;
    }

    public void setgNorm(String gNorm) {
        this.gNorm = gNorm == null ? null : gNorm.trim();
    }

    public String getgShelfLife() {
        return gShelfLife;
    }

    public void setgShelfLife(String gShelfLife) {
        this.gShelfLife = gShelfLife == null ? null : gShelfLife.trim();
    }

    public Integer getDownFlag() {
        return downFlag;
    }

    public void setDownFlag(Integer downFlag) {
        this.downFlag = downFlag;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}