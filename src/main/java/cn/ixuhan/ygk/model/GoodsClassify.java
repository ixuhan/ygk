package cn.ixuhan.ygk.model;

import java.util.Date;

public class GoodsClassify {
    /**
    * ��Ʒ����id
    */
    private Integer classifyId;

    /**
    * ��Ʒ������������
    */
    private String classifyName;

    /**
    * ��Ʒ������������
    */
    private String classifyDesc;

    /**
    * ��Ʒ����¼������
    */
    private Date classifyLrrq;

    /**
    * ��Ʒ�������ͼ��
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