package com.zking.ERP.model;

import java.util.Date;

public class storeoper {
    private Integer uuid;

    private Integer empuuid;

    private Date opertime;

    private Integer storeuuid;

    private Integer goodsuuid;

    private Integer num;

    private String type;

    public storeoper(Integer uuid, Integer empuuid, Date opertime, Integer storeuuid, Integer goodsuuid, Integer num, String type) {
        this.uuid = uuid;
        this.empuuid = empuuid;
        this.opertime = opertime;
        this.storeuuid = storeuuid;
        this.goodsuuid = goodsuuid;
        this.num = num;
        this.type = type;
    }

    public storeoper() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getEmpuuid() {
        return empuuid;
    }

    public void setEmpuuid(Integer empuuid) {
        this.empuuid = empuuid;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public Integer getStoreuuid() {
        return storeuuid;
    }

    public void setStoreuuid(Integer storeuuid) {
        this.storeuuid = storeuuid;
    }

    public Integer getGoodsuuid() {
        return goodsuuid;
    }

    public void setGoodsuuid(Integer goodsuuid) {
        this.goodsuuid = goodsuuid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}