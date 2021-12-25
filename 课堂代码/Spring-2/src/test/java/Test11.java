import com.bean.Personnel;
//import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test11 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");

        ///PropertyPlaceholderConfigurer  ppc =  classPathXmlApplicationContext.getBean("placeholderConfigurer", PropertyPlaceholderConfigurer.class);
       /// System.out.println(ppc);

        Personnel p = classPathXmlApplicationContext.getBean("personnel",Personnel.class);


        classPathXmlApplicationContext.close();//关闭Spring 容器
    }
}
