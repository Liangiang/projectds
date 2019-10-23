package com.ex.project.model;

public class ShopInfo {
    private Integer sId;

    private String sName;

    private String sPhone;

    private String sPassword;

    private String sHeadName;

    private String sEmail;

    private String sBusinessLicense;

    private String sAddress;

    private Integer sFlag;

    private Integer mId;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public String getsHeadName() {
        return sHeadName;
    }

    public void setsHeadName(String sHeadName) {
        this.sHeadName = sHeadName == null ? null : sHeadName.trim();
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail == null ? null : sEmail.trim();
    }

    public String getsBusinessLicense() {
        return sBusinessLicense;
    }

    public void setsBusinessLicense(String sBusinessLicense) {
        this.sBusinessLicense = sBusinessLicense == null ? null : sBusinessLicense.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public Integer getsFlag() {
        return sFlag;
    }

    public void setsFlag(Integer sFlag) {
        this.sFlag = sFlag;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }
}