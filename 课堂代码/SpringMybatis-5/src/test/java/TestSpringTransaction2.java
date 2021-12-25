import com.bean.DeptBean;
import com.service.DeptService;
import com.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpringTransaction2 {



    @Test
    public void t1(){
        //实例化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");



        //实验1： 去掉ServiceErrorLog切面类，去掉DeptServiceImpl 类中方法上的@Transactional 注解
                //观察getBean方法获得的deptServiceImpl是否是代理类
        //得到的结果为: deptServcie的类型为:com.service.impl.DeptServiceImpl,表示没使用代理 ，即没有使用aop


        //实验2  :  在 DeptServiceImpl 类中方法上的@Transactional 注解，观察getBean方法获得的deptServiceImpl是否是代理类
            //实现结果:返回  com.sun.proxy.$Proxy19  ,证明了加了@Transactional的方法对应类，被DataSourceTransactionManager 切面类拦截到了
        ///然后产生了相应代理类,在被DataSourceTransactionManager类的内部就可实施事务管理


        DeptService deptService =  context.getBean("deptServiceImpl", DeptServiceImpl.class);
        System.out.println("deptServcie的类型为:"+deptService.getClass().getName());



    }



}



