import com.bean.Personnel;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test8 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {


        List<Personnel> personnelList   = new ArrayList();

      for(int i=0;i<10;i++){

          Personnel personnel = new Personnel();

          personnel.setName("name"+i);
          personnel.setAge(10+i);
          personnel.setHeight(180+i);

          personnelList.add(personnel);
      }

      //集合中的第一个元素personnel的姓名为?
       System.out.println("集合中元素个数为:"+personnelList.size()); //10


        System.out.println("集合中的数据为:"+personnelList.get(0).getName());//name0

        System.out.println("集合中的数据为:"+personnelList);

    }
}
