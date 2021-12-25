import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.service.impl.UserServicenewImpl;
import com.servlet.UserServlet;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test7Proxy {


    @Test
    public  void t1(){

        UserServlet
         userServlet = new UserServlet();

       UserServiceHandler handler = new UserServiceHandler();

        //JDK动态代理 ,为某个类动态产生代理类，用Proxy.newProxyInstance方法动态产生第二个参数对象的类的代理类

        //第三个参数是调用由Proxy产生代理对象时的任意方法时，都会回调handler中的invoke方法
      Object object =   Proxy.newProxyInstance(
              userServlet.getClass().getClassLoader(),
              userServlet.getClass().getInterfaces(),handler );

        System.out.println(object.getClass().getSuperclass());
        System.out.println(object.getClass().getInterfaces().length);





    }
}


