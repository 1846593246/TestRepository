package com.service;

import com.bean.OrderBean;
import com.bean.OrderDetailsBean;

import java.util.List;

/**
 * @author Administrator
 */
public interface OrderService {
    /**
     * 批量
     * @param orderBeanList
     */
    public void saveOrder(List<OrderBean> orderBeanList);

    /**
     * 在此方法模拟生成一个订单信息（即往订单表中插入一条数据，订单明细表中插入1-N条数据）
     * @param orderBean
     */
    public void generatorOrder(OrderBean orderBean);
}
