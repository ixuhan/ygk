package cn.ixuhan.ygk.model;

import java.util.Date;

public class GoodsEntity {
    /**
    * ��Ʒid
    */
    private Integer goodsId;

    /**
    * ��Ʒ����
    */
    private String goodsName;

    /**
    * ��Ʒ����
    */
    private String goodsDesc;

    /**
    * ��Ʒ�۸�
    */
    private Double goodsPriceOld;

    private Double goodsPriceNew;

    /**
    * ��ƷͼƬ
    */
    private String goodsImg;

    /**
    * ��Ʒ¼������
    */
    private Date goodsLrrq;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public Double getGoodsPriceOld() {
        return goodsPriceOld;
    }

    public void setGoodsPriceOld(Double goodsPriceOld) {
        this.goodsPriceOld = goodsPriceOld;
    }

    public Double getGoodsPriceNew() {
        return goodsPriceNew;
    }

    public void setGoodsPriceNew(Double goodsPriceNew) {
        this.goodsPriceNew = goodsPriceNew;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Date getGoodsLrrq() {
        return goodsLrrq;
    }

    public void setGoodsLrrq(Date goodsLrrq) {
        this.goodsLrrq = goodsLrrq;
    }
}