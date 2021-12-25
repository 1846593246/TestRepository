package com.service;

import com.bean.OrderBean;
import com.bean.OrderDetailsBean;

import java.util.List;

/**
 * @author Administrator
 */
public interface OrderDetailsService {
    /**
     * 批量
     * @param orderDetailsBeanList
     */
    public void saveOrderDetails(List<OrderDetailsBean> orderDetailsBeanList);


    /**
     *
     */

}
