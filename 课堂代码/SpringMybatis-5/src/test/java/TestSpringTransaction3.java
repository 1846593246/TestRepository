import com.bean.PersonnelinroomBean;
import com.service.DeptService;
import com.service.PersonneInroomService;
import com.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestSpringTransaction3 {



    @Test
    public void t1(){
        //实例化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");




        PersonneInroomService personneInroomService =  context.getBean("personnelInroomServiceImpl", PersonneInroomService.class);

        PersonnelinroomBean personnelinroomBean = new PersonnelinroomBean();
        personnelinroomBean.setInroomid("i1");
        personnelinroomBean.setAddresscode("001");
        personnelinroomBean.setBednum(5);
        personnelinroomBean.setInroomdate(new Date());
        personnelinroomBean.setPersonnelid("p3");
        personnelinroomBean.setStatus(1);//代表入住
        personneInroomService.insert(personnelinroomBean);


    }



}



