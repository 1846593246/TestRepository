package mapper;

import com.bean.OrderBean;
import com.bean.OrderDetailsBean;
import com.service.OrderDetailsService;
import com.service.OrderService;
import org.aspectj.weaver.ast.Var;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TestOrder {
    @Test
    public void testOrder(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        OrderService orderServiceImpl = context.getBean("OrderServiceImpl", OrderService.class);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(new Date());

        java.sql.Date date = new java.sql.Date(new Date().getTime());


        OrderBean orderBean = new OrderBean("ADSWW1125", date, "大胖2", "湖南省株洲市");


        OrderDetailsService orderDetailsServiceImpl = context.getBean("OrderDetailsServiceImpl", OrderDetailsService.class);
        OrderDetailsBean orderDetailsBean = new OrderDetailsBean("SS20220124", "ADSWW1125", "雀巢", 12301000);
        ArrayList<OrderDetailsBean> orderDetailsBeanArrayList = new ArrayList<OrderDetailsBean>();
        orderDetailsBeanArrayList.add(orderDetailsBean);

        orderBean.setOrderDetailsBean(orderDetailsBeanArrayList);
        ArrayList<OrderBean> orderBeans = new ArrayList<OrderBean>();



        orderBeans.add(orderBean);
        orderServiceImpl.saveOrder(orderBeans);








        orderDetailsServiceImpl.saveOrderDetails(orderDetailsBeanArrayList);
    }
    @Test
    public void insertOrderDetails(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        OrderDetailsService orderDetailsServiceImpl = context.getBean("OrderDetailsServiceImpl", OrderDetailsService.class);

        OrderDetailsBean orderDetailsBean1 = new OrderDetailsBean("SS20220120", "ADSWW1123", "卡地亚手表", 12301000);
        OrderDetailsBean orderDetailsBean2 = new OrderDetailsBean("SS20220122", "ADSWW1123", "卡地亚手表", 12301000);
        OrderDetailsBean orderDetailsBean3 = new OrderDetailsBean("SS20220124", "ADSWW1123", "卡地亚手表", 12301000);
        OrderDetailsBean orderDetailsBean4 = new OrderDetailsBean("SS20220125", "ADSWW1123", "卡地亚手表", 12301000);
        OrderDetailsBean orderDetailsBean5 = new OrderDetailsBean("SS20220126", "ADSWW1123", "卡地亚手表", 12301000);


        ArrayList<OrderDetailsBean> orderDetailsBeanArrayList = new ArrayList<OrderDetailsBean>();
        orderDetailsBeanArrayList.add(orderDetailsBean1);
        orderDetailsBeanArrayList.add(orderDetailsBean2);
        orderDetailsBeanArrayList.add(orderDetailsBean3);
        orderDetailsBeanArrayList.add(orderDetailsBean4);
        orderDetailsBeanArrayList.add(orderDetailsBean5);

        orderDetailsServiceImpl.saveOrderDetails(orderDetailsBeanArrayList);


    }

    @Test
    public void t1(){
        java.sql.Date date = new java.sql.Date(new Date().getTime());
        ArrayList<OrderDetailsBean> orderDetailsBeanArrayList = new ArrayList<OrderDetailsBean>();
        orderDetailsBeanArrayList.add(new OrderDetailsBean("SS20220124","ADSWW1124","雀巢",123456));
        OrderBean orderBean = new OrderBean("ADSWW1126", date, "大胖3", "湖南省株洲市");
        orderBean.setOrderDetailsBean(orderDetailsBeanArrayList);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        OrderService orderServiceImpl = context.getBean("OrderServiceImpl", OrderService.class);

        orderServiceImpl.generatorOrder(orderBean);


    }
}


