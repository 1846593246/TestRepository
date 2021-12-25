import com.servlet.UserServlet;
import com.servlet.UserServlet2;
import com.util.JdbcUtil;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1.实例化Spring容器,读取application.xml配置文件 ，spring就会根据配置文件 中的配置信息启动spring


        //默认情况下，所有的交给Spring管理的javaBean在实例化spring容器时都会创建该类的对象，
        //  且在整个Spring容器中，该类对象只创建一个

        //ApplicationContext 在初始化上下文时就实例化所有单例的 Bean

         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("-------------------------------------------");
         UserServlet u1 =   context.getBean("userServlet", UserServlet.class);


        UserServlet u2  =   context.getBean("userServlet", UserServlet.class);

        System.out.println("u1==u2"+(u1==u2));//结果为true,表示多次从spring容器中根据id相同的对象，都是同一个实例


        System.out.println("******************************************");
        UserServlet2 userServlet2  =  context.getBean("userservlet2", UserServlet2.class);

        userServlet2.doGet();;
    }
}
