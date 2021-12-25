package aop;

import com.test.Service;
import com.test.impl.GoodsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void t1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");

        Service goodsService = classPathXmlApplicationContext.getBean("GoodsService", Service.class);

        Object sql = goodsService.save("sql");
    }
}
