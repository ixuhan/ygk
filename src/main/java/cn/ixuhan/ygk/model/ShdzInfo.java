package cn.ixuhan.ygk.model;

import java.util.Date;

public class ShdzInfo {
    /**
    * �û��ջ���Ϣid
    */
    private Integer infoId;

    /**
    * �û�openid
    */
    private String openid;

    /**
    * �û������ջ���ַ
    */
    private String orderAddress;

    /**
    * �û��ֻ�����
    */
    private String userPhone;

    /**
    * ��Ϣ¼������
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