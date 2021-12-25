package com.mapper;

import com.bean.OrderBean;

import java.util.List;

/**
 * @author Administrator
 */
public interface OrderBeanMapper {
    /**
     * 存储订单
     * @param orderBean
     */
    public void saveOrder(OrderBean orderBean);
}
