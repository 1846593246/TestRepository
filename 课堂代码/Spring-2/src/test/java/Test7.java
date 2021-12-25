import com.bean.Personnel;
import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

public class Test7 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        final  ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");


        System.out.println("---------------------------------------------------------------");


       new Thread(){
           public void run(){
                Personnel p =  classPathXmlApplicationContext.getBean("personnel",Personnel.class);

               System.out.println("---------前端提交表单，为Personnel对象赋值1111---------");
               p.setName("张三");
               p.setAge(18);
               p.setHeight(180);
               System.out.println("--------------调用service以及调用dao的方法，保存到数据库111---------------");

               try {
                   Thread.sleep(1);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("保存到数据库的的Personnel为11111:"+p);

           }
       }.start();


        new Thread(){
            public void run(){
                Personnel p =  classPathXmlApplicationContext.getBean("personnel",Personnel.class);
                System.out.println("---------前端提交表单，为Personnel对象赋值2222---------");
                p.setName("李四");
                p.setAge(16);
                p.setHeight(190);
                System.out.println("--------------调用service以及调用dao的方法，保存到数据库2222---------------");
                System.out.println("保存到数据库的的Personnel22222为:"+p);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }.start();

    }
}
