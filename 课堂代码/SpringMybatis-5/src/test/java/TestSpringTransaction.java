import com.bean.DeptBean;
import com.service.DeptService;
import com.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpringTransaction {



    @Test
    public void t1(){
        //实例化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        //DefaultSqlSessionFactory sfb =  context.getBean("sqlSessionFactory", DefaultSqlSessionFactory.class);

        DeptBean deptBean1 = new DeptBean("d1",null,"Spring1",1);
        DeptBean deptBean2 = new DeptBean("d2","d1","Spring2",1);
        DeptBean deptBean3 = new DeptBean("d3","d5","Spring3",1);
        DeptBean deptBean4 = new DeptBean("d4","d4","Spring4",1);

        List<DeptBean> deptBeanList = new ArrayList<DeptBean>();

        deptBeanList.add(deptBean1);
        deptBeanList.add(deptBean2);
        deptBeanList.add(deptBean3);
        deptBeanList.add(deptBean4);


        DeptService deptService =  context.getBean("deptServiceImpl", DeptService.class);
        deptService.batchInsert(deptBeanList);



    }



}



