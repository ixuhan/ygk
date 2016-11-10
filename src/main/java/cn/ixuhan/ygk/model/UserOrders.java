package cn.ixuhan.ygk.model;

import java.util.Date;

public class UserOrders {
    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 用户id
    */
    private String openid;

    /**
    * 用户收货信息id
    */
    private Integer infoId;

    /**
    * 商品id
    */
    private Integer goodsId;

    /**
    * 订单生产日期
    */
    private Date orderLrrq;

    /**
    * 订单状态 0-创建未支付 1-已支付未送达 2-正在派送 3-订单完成 4-错误订单
    */
    private Integer orderStatus;

    /**
    * 订单号 可为空 若发快递则填写
    */
    private String orderNumber;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getOrderLrrq() {
        return orderLrrq;
    }

    public void setOrderLrrq(Date orderLrrq) {
        this.orderLrrq = orderLrrq;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}