package com.example.demo.model;

import java.util.Date;

/**
 * 这是一个简单的商品类
 * 当然实际工程中，针对不同的产品应该有不同的实体类，这里简化为统一的格式。
 * 比如食品通常有保质期，而图书则没有。
 */
public class Product {
    private Integer id;
    //很显然，商品的名字应该具有唯一性，但是在处理商品时，这却不是好的的字段，用数字则更有通用性。
    private  String productName;
    private String palce;
    private Integer num;
    private String priceUnit;
    private Float productPrice;
    private Float discount;
    private Date producedDate;
    private Date expiredDate;

    public Product() {
    }

    /**
     * 一个存构造器，一个取构造器，想想空构造器干啥的
     * @param id 商品id
     * @param productName 名称
     * @param palce 产地
     * @param num 库存量
     * @param priceUnit 销售单位
     * @param productPrice 价格
     * @param producedDate 生产时间。
     * @param expiredDate 过期时间
     */
    public Product(Integer id, String productName, String palce, Integer num, String priceUnit, Float productPrice, Float discount,Date producedDate, Date expiredDate) {
        this.id = id;
        this.productName = productName;
        this.palce = palce;
        this.num = num;
        this.priceUnit = priceUnit;
        this.productPrice = productPrice;
        this.discount= discount;
        this.producedDate = producedDate;
        this.expiredDate = expiredDate;
    }

    public Product(String productName, String palce, Integer num, String priceUnit, Float productPrice, Float discount,Date producedDate, Date expiredDate) {
        this.productName = productName;
        this.palce = palce;
        this.num = num;
        this.priceUnit = priceUnit;
        this.productPrice = productPrice;
        this.discount = discount;
        this.producedDate = producedDate;
        this.expiredDate = expiredDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPalce() {
        return palce;
    }

    public void setPalce(String palce) {
        this.palce = palce;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Date getProducedDate() {
        return producedDate;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public void setProducedDate(Date producedDate) {
        this.producedDate = producedDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
}
