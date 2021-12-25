import com.bean.Personnel;
//import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test9 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Personnel p  = new Personnel("张三",10,180);
        Personnel p1 = p; //p1 和p 指向同一个对象
        System.out.println("p.equals(p1):"+ p.equals(p1));//返回 true
        System.out.println("p==p1:"+( p==p1));//返回 true  ==  比较内存地址


        Personnel p2  = new Personnel("张三",10,180);

        System.out.println("p.equals(p2):"+ p.equals(p2));//返回false  原因 没有重写equals方法
        //如果两个new的对象用equals方法比较要返回true，必需重写的equals方法

    //不允许存储重复元素
        Set<Personnel> personnels = new HashSet();
        personnels.add(p);
        personnels.add(p1);
        personnels.add(p2);

        System.out.println(p.hashCode()%10);
        System.out.println(p2.hashCode()%10);
        System.out.println("集合中的元素个数为:"+personnels.size());


    }
}
