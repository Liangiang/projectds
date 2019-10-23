package com.ex.project.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private Integer oId;

    private Integer gId;

    private String gName;

    private String imgUrl;

    private Integer uId;

    private Integer sId;

    private Double oPrice;

    private Integer oNum;

    private BigDecimal countPrice;

    private Date oTime;
    /**
     * @Description 0下订单，1付款，2取消订单，3发货，4收货，5申请退货，6同意退货，7拒绝退货
     **/
    private Integer oStatus;

    private String getUName;

    private String getUPhone;

    private String getUDdress;

    private String uRecause;

    private String sReseason;

    private Date payTime;

    private Date passPayTime;

    private Date sSendIme;

    private Date uGetTime;

    private Date uApplyRegoodsTime;

    private Date sAgreeRegoodsTime;

    private Date sRefuseRegoodsIme;
    //+++++
    private Integer currentPage;

    private Integer pageSize;
    //++++++-end

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Double getoPrice() {
        return oPrice;
    }

    public void setoPrice(Double oPrice) {
        this.oPrice = oPrice;
    }

    public Integer getoNum() {
        return oNum;
    }

    public void setoNum(Integer oNum) {
        this.oNum = oNum;
    }

    public BigDecimal getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(BigDecimal countPrice) {
        this.countPrice = countPrice;
    }

    public Date getoTime() {
        return oTime;
    }

    public void setoTime(Date oTime) {
        this.oTime = oTime;
    }

    public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    public String getGetUName() {
        return getUName;
    }

    public void setGetUName(String getUName) {
        this.getUName = getUName == null ? null : getUName.trim();
    }

    public String getGetUPhone() {
        return getUPhone;
    }

    public void setGetUPhone(String getUPhone) {
        this.getUPhone = getUPhone == null ? null : getUPhone.trim();
    }

    public String getGetUDdress() {
        return getUDdress;
    }

    public void setGetUDdress(String getUDdress) {
        this.getUDdress = getUDdress == null ? null : getUDdress.trim();
    }

    public String getuRecause() {
        return uRecause;
    }

    public void setuRecause(String uRecause) {
        this.uRecause = uRecause == null ? null : uRecause.trim();
    }

    public String getsReseason() {
        return sReseason;
    }

    public void setsReseason(String sReseason) {
        this.sReseason = sReseason == null ? null : sReseason.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPassPayTime() {
        return passPayTime;
    }

    public void setPassPayTime(Date passPayTime) {
        this.passPayTime = passPayTime;
    }

    public Date getsSendIme() {
        return sSendIme;
    }

    public void setsSendIme(Date sSendIme) {
        this.sSendIme = sSendIme;
    }

    public Date getuGetTime() {
        return uGetTime;
    }

    public void setuGetTime(Date uGetTime) {
        this.uGetTime = uGetTime;
    }

    public Date getuApplyRegoodsTime() {
        return uApplyRegoodsTime;
    }

    public void setuApplyRegoodsTime(Date uApplyRegoodsTime) {
        this.uApplyRegoodsTime = uApplyRegoodsTime;
    }

    public Date getsAgreeRegoodsTime() {
        return sAgreeRegoodsTime;
    }

    public void setsAgreeRegoodsTime(Date sAgreeRegoodsTime) {
        this.sAgreeRegoodsTime = sAgreeRegoodsTime;
    }

    public Date getsRefuseRegoodsIme() {
        return sRefuseRegoodsIme;
    }

    public void setsRefuseRegoodsIme(Date sRefuseRegoodsIme) {
        this.sRefuseRegoodsIme = sRefuseRegoodsIme;
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