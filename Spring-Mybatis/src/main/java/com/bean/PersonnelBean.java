package com.bean;

import java.util.Date;

public class PersonnelBean {
    private String personnelid;

    private String deptid;

    private String name;

    private String gender;

    private String mobilephone;

    private Date birthday;

    private Date registedate;

    private String idcardno;

    private String photo;

    public String getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(String personnelid) {
        this.personnelid = personnelid == null ? null : personnelid.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegistedate() {
        return registedate;
    }

    public void setRegistedate(Date registedate) {
        this.registedate = registedate;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}