import com.bean.Personnel;
//import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class Test10 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        final ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");

        ///PropertyPlaceholderConfigurer  ppc =  classPathXmlApplicationContext.getBean("placeholderConfigurer", PropertyPlaceholderConfigurer.class);
       /// System.out.println(ppc);

           BasicDataSource basicDataSource =   classPathXmlApplicationContext.getBean("datasource", BasicDataSource.class);
        System.out.println(basicDataSource.getConnection());

    }
}
