import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.service.impl.UserServicenewImpl;
import com.servlet.UserServlet;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1.实例化Spring容器,读取application.xml配置文件 ，spring就会根据配置文件 中的配置信息启动spring

         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        UserServlet userServlet =  context.getBean("userServlet", UserServlet.class);
        System.out.println(userServlet);
        userServlet.doGet();

        UserService userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userService);


    }
}
