package com.goodsoft.yuanlin.domain.entity.demand;

/**
 * 苗木参考报价实体
 * Created by 严彬荣 on 2017/9/4.
 * version v1.0
 */
public class SeedlingOffer implements java.io.Serializable {
    private Integer sid;//序号
    private String material;//材料
    private String specification;//规格
    private String unit;//单位
    private double price;//价格
    private String types;//类别
    private String comment;//备注
    private String date;//日期
    private String fileId;//文件编号

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
