import com.service.UserService;
import com.servlet.UserServlet;
//import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Test1 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1.实例化Spring容器,读取application.xml配置文件 ，spring就会根据配置文件 中的配置信息启动spring



        //如果 applcation.xml配置文件不在resource目录下，可以用FileSystemXmlApplicationContext读取配置文件
      //  FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("F:\\application.xml");


        // path
        // classpath

      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

       /// context.getBean("配置文件 中bean的id属性值");
      //  UserServlet userServlet = new UserServlet();
        UserServlet userServlet =  context.getBean("userServlet", UserServlet.class);

        UserService userService = context.getBean("userSrvice",UserService.class);

        //servlet依赖UserService,因此可以手动的调用set方法将userServie传入进去
        userServlet.setUs(userService);


        userServlet.doGet();



        //Spring读取配置文件 中的bean标签，根据Bean标签的id 以及class=包名类名,创建相应的对象，把对象用Map形式存储起来

        /**
         *     <bean id="userServlet" class="com.servlet.UserServlet"></bean>
         *
         *     <bean id="userSrvice" class="com.service.impl.UserServiceImpl"></bean>
         *
         *     <bean id="userDao" class="com.dao.impl.UserDaoImpl"></bean>
         *
         * Class.forName("com.servlet.UserServlet").newInstance();
         *      Class.forName("com.servlet.UserServlet").newInstance();

        Map<String,Object> context = new HashMap<String, Object>();
        context.put("userServlet",Class.forName("com.servlet.UserServlet").newInstance());
        context.put("userSrvice",Class.forName("com.service.impl.UserServiceImpl").newInstance());
        context.put("userDao",Class.forName("com.dao.impl.UserDaoImpl").newInstance());

         */

       // context.get("userDao")
    }
}
