package com.zking.ERP.model;

import java.math.BigDecimal;
import java.util.Date;

public class orderdetail {
    private Integer uuid;

    private Integer goodsuuid;

    private String goodsname;

    private BigDecimal price;

    private Integer num;

    private Long money;

    private Date endtime;

    private Integer ender;

    private Integer storeuuid;

    private String stare;

    private Integer ordersuuid;

    public orderdetail(Integer uuid, Integer goodsuuid, String goodsname, BigDecimal price, Integer num, Long money, Date endtime, Integer ender, Integer storeuuid, String stare, Integer ordersuuid) {
        this.uuid = uuid;
        this.goodsuuid = goodsuuid;
        this.goodsname = goodsname;
        this.price = price;
        this.num = num;
        this.money = money;
        this.endtime = endtime;
        this.ender = ender;
        this.storeuuid = storeuuid;
        this.stare = stare;
        this.ordersuuid = ordersuuid;
    }

    public orderdetail() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getGoodsuuid() {
        return goodsuuid;
    }

    public void setGoodsuuid(Integer goodsuuid) {
        this.goodsuuid = goodsuuid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getEnder() {
        return ender;
    }

    public void setEnder(Integer ender) {
        this.ender = ender;
    }

    public Integer getStoreuuid() {
        return storeuuid;
    }

    public void setStoreuuid(Integer storeuuid) {
        this.storeuuid = storeuuid;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public Integer getOrdersuuid() {
        return ordersuuid;
    }

    public void setOrdersuuid(Integer ordersuuid) {
        this.ordersuuid = ordersuuid;
    }
}