import com.util.JdbcUtil;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1.实例化Spring容器,读取application.xml配置文件 ，spring就会根据配置文件 中的配置信息启动spring

         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

          JdbcUtil jdbcUtil =  context.getBean("jdbcUtil", JdbcUtil.class);
        System.out.println(jdbcUtil.getUrl());
    }
}
