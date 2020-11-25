package com.zking.ERP.model;

public class role {
    private Integer uuid;

    private String name;

    public role(Integer uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public role() {
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
}