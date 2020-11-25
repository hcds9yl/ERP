package com.zking.ERP.model;

public class empRole {
    private Integer empuuid;

    private Integer roleuuid;

    public empRole(Integer empuuid, Integer roleuuid) {
        this.empuuid = empuuid;
        this.roleuuid = roleuuid;
    }

    public empRole() {
        super();
    }

    public Integer getEmpuuid() {
        return empuuid;
    }

    public void setEmpuuid(Integer empuuid) {
        this.empuuid = empuuid;
    }

    public Integer getRoleuuid() {
        return roleuuid;
    }

    public void setRoleuuid(Integer roleuuid) {
        this.roleuuid = roleuuid;
    }
}