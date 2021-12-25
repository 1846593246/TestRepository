package com.mapper;

import com.bean.OrderDetailsBean;

import java.util.List;

/**
 * @author Administrator
 */
public interface OrderDetailsBeanMapper  {
    /**
     * 存储订单详情数据
     * @param orderDetailsBean
     */
    public void saveOrderDetails(OrderDetailsBean orderDetailsBean);
}
