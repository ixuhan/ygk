package cn.ixuhan.ygk.model;

import java.util.Date;

public class UserOrders {
    /**
    * ����id
    */
    private Integer orderId;

    /**
    * �û�id
    */
    private String openid;

    /**
    * �û��ջ���Ϣid
    */
    private Integer infoId;

    /**
    * ��Ʒid
    */
    private Integer goodsId;

    /**
    * ������������
    */
    private Date orderLrrq;

    /**
    * ����״̬ 0-����δ֧�� 1-��֧��δ�ʹ� 2-�������� 3-������� 4-���󶩵�
    */
    private Integer orderStatus;

    /**
    * ������ ��Ϊ�� �����������д
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