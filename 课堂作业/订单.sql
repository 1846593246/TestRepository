/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2021-11-27 14:50:47                          */
/*==============================================================*/


drop table if exists tbl_order;

drop table if exists tbl_order_details;

/*==============================================================*/
/* Table: tbl_order                                             */
/*==============================================================*/
create table tbl_order
(
   id                   varchar(32) not null comment '订单编号',
   ordertime            datetime not null comment '下单日期',
   name                 varchar(12) not null comment '下单 人姓名',
   address              varchar(64) not null comment '收货地址',
   primary key (id)
);

/*==============================================================*/
/* Table: tbl_order_details                                     */
/*==============================================================*/
create table tbl_order_details
(
   orderdetalsid        varchar?(32) not null comment '明细编号[主键]',
   id                   varchar(32) comment '订单编号',
   goodsname            varchar(64) not null comment '商品名称',
   goodssimpleprice     int not null comment '单品单价',
   primary key (orderdetalsid)
);

alter table tbl_order_details add constraint FK_Reference_1 foreign key (id)
      references tbl_order (id) on delete restrict on update restrict;

