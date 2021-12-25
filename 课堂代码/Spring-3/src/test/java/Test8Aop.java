import com.dao.impl.UserDaoImpl;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8Aop {


    @Test
    public void t1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
       //
        // Bean named 'userServiceImpl' is expected to be of type
        // 'com.service.impl.UserServiceImpl' but was actually of type 'com.sun.proxy.$Proxy17'

        //用切入点表达式  @Pointcut("execution(* com.service.UserService.*(..) )") 拦截到UserService类中的任意方法
        //Spring就会用到动态代理技术(JDK 基于接口,CGlib 基于子)其中的一种为你要得到的Bean产生代理类 ,
        // 当我们要得到的Bean是实现了某个接口时，Spring就用JDCK动态代理 帮我们实现



        //如果用到了Spring AopA，且切入点是在我们要得到的Bean上，当该Bean实现了某个接口时，getBean方法返回 类型是接口类型
        UserService userService =  context.getBean("userServiceImpl", UserService.class);
        userService.save("xxx");

        userService.query("w");
        userService.deleteById("id");
        userService.update("x");

      //  UserServiceImpl userService =  context.getBean("userServiceImpl", UserServiceImpl.class);
      //  userService.save("xxx");
    }
}
