package com.bean;

public class AddressBean {
    private String addresscode;

    private String parentaddresscode;

    private String roomtypeid;

    private String addressname;

    private Integer bennum;

    public String getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(String addresscode) {
        this.addresscode = addresscode == null ? null : addresscode.trim();
    }

    public String getParentaddresscode() {
        return parentaddresscode;
    }

    public void setParentaddresscode(String parentaddresscode) {
        this.parentaddresscode = parentaddresscode == null ? null : parentaddresscode.trim();
    }

    public String getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(String roomtypeid) {
        this.roomtypeid = roomtypeid == null ? null : roomtypeid.trim();
    }

    public String getAddressname() {
        return addressname;
    }

    public void setAddressname(String addressname) {
        this.addressname = addressname == null ? null : addressname.trim();
    }

    public Integer getBennum() {
        return bennum;
    }

    public void setBennum(Integer bennum) {
        this.bennum = bennum;
    }
}