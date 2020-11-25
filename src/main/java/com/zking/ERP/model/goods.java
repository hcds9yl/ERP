package com.zking.ERP.model;

import java.math.BigDecimal;

public class goods {
    private Integer uuid;

    private String name;

    private String origin;

    private String producer;

    private String unit;

    private BigDecimal inprice;

    private BigDecimal outprice;

    private Integer goodstypeuuid;

    public goods(Integer uuid, String name, String origin, String producer, String unit, BigDecimal inprice, BigDecimal outprice, Integer goodstypeuuid) {
        this.uuid = uuid;
        this.name = name;
        this.origin = origin;
        this.producer = producer;
        this.unit = unit;
        this.inprice = inprice;
        this.outprice = outprice;
        this.goodstypeuuid = goodstypeuuid;
    }

    public goods() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getInprice() {
        return inprice;
    }

    public void setInprice(BigDecimal inprice) {
        this.inprice = inprice;
    }

    public BigDecimal getOutprice() {
        return outprice;
    }

    public void setOutprice(BigDecimal outprice) {
        this.outprice = outprice;
    }

    public Integer getGoodstypeuuid() {
        return goodstypeuuid;
    }

    public void setGoodstypeuuid(Integer goodstypeuuid) {
        this.goodstypeuuid = goodstypeuuid;
    }
}