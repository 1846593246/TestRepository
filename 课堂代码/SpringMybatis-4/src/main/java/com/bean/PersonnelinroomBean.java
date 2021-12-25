package com.bean;

import java.util.Date;

public class PersonnelinroomBean {
    private String inroomid;

    private String personnelid;

    private String addresscode;

    private Integer status;

    private Date inroomdate;

    private Date enddate;

    private Integer bednum;

    public String getInroomid() {
        return inroomid;
    }

    public void setInroomid(String inroomid) {
        this.inroomid = inroomid == null ? null : inroomid.trim();
    }

    public String getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(String personnelid) {
        this.personnelid = personnelid == null ? null : personnelid.trim();
    }

    public String getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(String addresscode) {
        this.addresscode = addresscode == null ? null : addresscode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getInroomdate() {
        return inroomdate;
    }

    public void setInroomdate(Date inroomdate) {
        this.inroomdate = inroomdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getBednum() {
        return bednum;
    }

    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }
}