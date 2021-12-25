package com.service.impl;

import com.bean.OrderBean;
import com.bean.OrderDetailsBean;
import com.mapper.OrderBeanMapper;
import com.mapper.OrderDetailsBeanMapper;
import com.service.OrderDetailsService;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 */
@Service(value = "OrderDetailsServiceImpl")
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsBeanMapper orderDetailsBeanMapper;


    /**
     * 批量
     *
     * @param orderDetailsBeanList
     */

    @Transactional()
    public void saveOrderDetails(List<OrderDetailsBean> orderDetailsBeanList) {

        for (int i = 0; i < orderDetailsBeanList.size(); i++) {
            orderDetailsBeanMapper.saveOrderDetails(orderDetailsBeanList.get(i));
        }
    }
}
