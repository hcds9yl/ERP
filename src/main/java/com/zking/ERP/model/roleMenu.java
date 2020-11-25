package com.zking.ERP.model;

public class roleMenu {
    private Integer roleuuid;

    private String menuuid;

    public roleMenu(Integer roleuuid, String menuuid) {
        this.roleuuid = roleuuid;
        this.menuuid = menuuid;
    }

    public roleMenu() {
        super();
    }

    public Integer getRoleuuid() {
        return roleuuid;
    }

    public void setRoleuuid(Integer roleuuid) {
        this.roleuuid = roleuuid;
    }

    public String getMenuuid() {
        return menuuid;
    }

    public void setMenuuid(String menuuid) {
        this.menuuid = menuuid;
    }
}