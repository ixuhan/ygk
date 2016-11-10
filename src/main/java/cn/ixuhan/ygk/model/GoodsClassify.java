package cn.ixuhan.ygk.model;

import java.util.Date;

public class GoodsClassify {
    /**
    * 商品分类id
    */
    private Integer classifyId;

    /**
    * 商品分类类型名称
    */
    private String classifyName;

    /**
    * 商品分类类型描述
    */
    private String classifyDesc;

    /**
    * 商品分类录入日期
    */
    private Date classifyLrrq;

    /**
    * 商品分类分类图标
    */
    private byte[] classifyImg;

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getClassifyDesc() {
        return classifyDesc;
    }

    public void setClassifyDesc(String classifyDesc) {
        this.classifyDesc = classifyDesc;
    }

    public Date getClassifyLrrq() {
        return classifyLrrq;
    }

    public void setClassifyLrrq(Date classifyLrrq) {
        this.classifyLrrq = classifyLrrq;
    }

    public byte[] getClassifyImg() {
        return classifyImg;
    }

    public void setClassifyImg(byte[] classifyImg) {
        this.classifyImg = classifyImg;
    }
}