package cn.ixuhan.ygk.model;

import java.util.Date;

public class ShdzInfo {
    /**
    * 用户收货信息id
    */
    private Integer infoId;

    /**
    * 用户openid
    */
    private String openid;

    /**
    * 用户常用收货地址
    */
    private String orderAddress;

    /**
    * 用户手机号码
    */
    private String userPhone;

    /**
    * 信息录入日期
    */
    private Date infoLrrq;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getInfoLrrq() {
        return infoLrrq;
    }

    public void setInfoLrrq(Date infoLrrq) {
        this.infoLrrq = infoLrrq;
    }
}