package com.bean;

import java.sql.Date;
import java.util.List;

/**
 * @author Administrator
 */
public class OrderBean {
    public List<OrderDetailsBean> getOrderDetailsBean() {
        return orderDetailsBeanList;
    }

    public void setOrderDetailsBean(List<OrderDetailsBean> orderDetailsBean) {
        this.orderDetailsBeanList = orderDetailsBean;
    }

    private List<OrderDetailsBean> orderDetailsBeanList;
    public OrderBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "id='" + id + '\'' +
                ", ordertime=" + ordertime +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public OrderBean(String id, Date ordertime, String name, String address) {
        this.id = id;
        this.ordertime = ordertime;
        this.name = name;
        this.address = address;
    }

    private String id;               //varchar(32) not null comment '订单编号',
    private Date ordertime;           //datetime not null comment '下单日期',
    private String name;          //  varchar(12) not null comment '下单 人姓名',
    private String address;          //  varchar(64) not null comment '收货地址',

}
