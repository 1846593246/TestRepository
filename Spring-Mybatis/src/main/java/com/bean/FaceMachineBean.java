package com.bean;

public class FaceMachineBean {
    private String machineid;

    private String addresscode;

    private String machinename;

    private String machineip;

    private String pwd;

    private String lastonlinedate;

    private String heartbeaturl;

    private String invoiceurl;

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid == null ? null : machineid.trim();
    }

    public String getAddresscode() {
        return addresscode;
    }

    public void setAddresscode(String addresscode) {
        this.addresscode = addresscode == null ? null : addresscode.trim();
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename == null ? null : machinename.trim();
    }

    public String getMachineip() {
        return machineip;
    }

    public void setMachineip(String machineip) {
        this.machineip = machineip == null ? null : machineip.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getLastonlinedate() {
        return lastonlinedate;
    }

    public void setLastonlinedate(String lastonlinedate) {
        this.lastonlinedate = lastonlinedate == null ? null : lastonlinedate.trim();
    }

    public String getHeartbeaturl() {
        return heartbeaturl;
    }

    public void setHeartbeaturl(String heartbeaturl) {
        this.heartbeaturl = heartbeaturl == null ? null : heartbeaturl.trim();
    }

    public String getInvoiceurl() {
        return invoiceurl;
    }

    public void setInvoiceurl(String invoiceurl) {
        this.invoiceurl = invoiceurl == null ? null : invoiceurl.trim();
    }
}