import com.util.Resource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Test6 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

     /*
        BasicDataSource dataSource = new BasicDataSource();  //JdbcUtil   Class.forName

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPassword("jerrycjr80231");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/dormsystem?characterEncoding=UTF-8&useSSL=false");
        dataSource.setUsername("root");



        Connection connection =  dataSource.getConnection();
        System.out.println(connection);
*/

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");

        BasicDataSource  basicDataSource =  classPathXmlApplicationContext.getBean("datasource", BasicDataSource.class);


        Connection connection =  basicDataSource.getConnection();
        System.out.println(connection);
    }
}
