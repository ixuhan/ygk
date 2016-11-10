package cn.ixuhan.ygk.model;

import java.util.Date;

public class GoodsEntity {
    /**
    * 商品id
    */
    private Integer goodsId;

    /**
    * 商品名称
    */
    private String goodsName;

    /**
    * 商品描述
    */
    private String goodsDesc;

    /**
    * 商品价格
    */
    private Double goodsPriceOld;

    private Double goodsPriceNew;

    /**
    * 商品图片
    */
    private String goodsImg;

    /**
    * 商品录入日期
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