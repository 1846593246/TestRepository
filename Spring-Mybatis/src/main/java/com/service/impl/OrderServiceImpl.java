package com.service.impl;

import com.bean.OrderBean;
import com.bean.OrderDetailsBean;
import com.mapper.OrderBeanMapper;
import com.mapper.OrderDetailsBeanMapper;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 */
@Service(value = "OrderServiceImpl")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderBeanMapper orderBeanMapper;

    @Autowired
    private OrderDetailsBeanMapper orderDetailsBeanMapper;
    /**
     * 批量
     *
     * @param orderBeanList
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrder(List<OrderBean> orderBeanList) {
        for (int i = 0; i < orderBeanList.size(); i++) {
            orderBeanMapper.saveOrder(orderBeanList.get(i));
        }
    }

    /**
     * 在此方法模拟生成一个订单信息（即往订单表中插入一条数据，订单明细表中插入1-N条数据）
     *
     * @param orderBean
     *
     */
    @Transactional
    public void generatorOrder(OrderBean orderBean) {

        /**
         * 增加订单数据
         */
        orderBeanMapper.saveOrder(orderBean);

        /**
         * 将订单详情数据插入到订单详情表中
         */
        for (int i = 0; i < orderBean.getOrderDetailsBean().size(); i++) {
            orderDetailsBeanMapper.saveOrderDetails(orderBean.getOrderDetailsBean().get(i));
        }


    }
}
