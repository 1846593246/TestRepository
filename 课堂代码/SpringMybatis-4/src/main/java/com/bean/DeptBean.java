package com.bean;

public class DeptBean {
    private String deptid;

    private String parentdeptid;

    private String deptname;

    private Integer level;

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getParentdeptid() {
        return parentdeptid;
    }

    public void setParentdeptid(String parentdeptid) {
        this.parentdeptid = parentdeptid == null ? null : parentdeptid.trim();
    }

    @Override
    public String toString() {
        return "DeptBean{" +
                "deptid='" + deptid + '\'' +
                ", parentdeptid='" + parentdeptid + '\'' +
                ", deptname='" + deptname + '\'' +
                ", level=" + level +
                '}';
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}