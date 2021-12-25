package mapper;

import com.bean.DeptBean;
import com.service.DeptService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMapper {
    @Test
    public void t1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");


        DeptService deptServiceImpl = context.getBean("deptServiceImpl", DeptService.class);

        List<DeptBean> select = deptServiceImpl.select(null);

        System.out.println(select);
    }
    @Test
    public void insert(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        DeptService deptServiceImpl = context.getBean("DeptServiceImpl", DeptService.class);

        DeptBean deptBean = new DeptBean();
        deptBean.setDeptid("1234");
        deptBean.setDeptname("大胖");
        int insert = deptServiceImpl.insert(deptBean);

    }
}
