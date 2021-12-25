package com.bean;

/**
 * @author Administrator
 */
public class OrderDetailsBean {
    private String orderdetalsid;  //varchar(32) not null comment '明细编号[主键]',

    public OrderDetailsBean() {
    }

    public OrderDetailsBean(String orderdetalsid, String id, String goodsname, int goodssimpleprice) {
        this.orderdetalsid = orderdetalsid;
        this.id = id;
        this.goodsname = goodsname;
        this.goodssimpleprice = goodssimpleprice;
    }

    private String id;
    ;  //  varchar(32) comment '订单编号',
    private String goodsname;   // varchar(64) not null comment '商品名称',
    private int goodssimpleprice; // int not null comment '单品单价',

    @Override
    public String toString() {
        return "OrderDetailsBean{" +
                "orderdetalsid='" + orderdetalsid + '\'' +
                ", id='" + id + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", goodssimpleprice='" + goodssimpleprice + '\'' +
                '}';
    }

    public String getOrderdetalsid() {
        return orderdetalsid;
    }

    public void setOrderdetalsid(String orderdetalsid) {
        this.orderdetalsid = orderdetalsid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public int getGoodssimpleprice() {
        return goodssimpleprice;
    }

    public void setGoodssimpleprice(int goodssimpleprice) {
        this.goodssimpleprice = goodssimpleprice;
    }
}
