package com.bean;

public class RoomtypeBean {
    private String roomtypeid;

    private String roomname;

    private Integer num;

    private String gender;

    public String getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(String roomtypeid) {
        this.roomtypeid = roomtypeid == null ? null : roomtypeid.trim();
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}