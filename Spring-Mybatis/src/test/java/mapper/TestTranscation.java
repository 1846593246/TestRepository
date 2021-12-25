package mapper;

import com.bean.DeptBean;
import com.service.DeptService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestTranscation {
    @Test
    public void t1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        DeptService deptServiceImpl = context.getBean("DeptServiceImpl", DeptService.class);
        ArrayList<DeptBean> deptBeans = new ArrayList<DeptBean>();


    }
}
