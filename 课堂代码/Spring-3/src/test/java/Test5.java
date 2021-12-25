import com.util.Resource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {


    @Test
    public void t1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("-------------------------------------------");

         Resource resource =   context.getBean("resource", Resource.class);
        System.out.println(resource.getName());
        System.out.println(resource.getDbconfig());

        System.out.println("list中的数据为:"+resource.getList());
        System.out.println("set中的数据为:"+resource.getSet());
        System.out.println("properties中的数据为:"+resource.getProperties());
    }
}
