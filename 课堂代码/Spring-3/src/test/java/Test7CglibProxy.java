import com.servlet.UserServlet;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test7CglibProxy {


    @Test
    public  void t1(){

        UserServlet     userServlet = new UserServlet();
        //产生UserServlet类的子类对象

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userServlet.getClass());//设置父类的类型
        //jdbutil.query(sql,Mapper)
        CglibHandler cglibHandler = new CglibHandler();
        enhancer.setCallback(cglibHandler); //设置回调

        cglibHandler.setUserServlet(userServlet);//把被代理对象传入进去



        UserServlet userServletProxy = (UserServlet)enhancer.create();//根据setSuperclass所设置的父类类型产生子类对象
        System.out.println(userServletProxy.getClass().getName());//类名为UserServlet$$EnhancerByCGLIB$$18ee3650

        System.out.println("代理类的父类为:"+ userServletProxy.getClass().getSuperclass().getName());
        //调用代理对象的dotGet方法，为什么在控制中没有打印出UserServlet类中的doGet方法被执行那行语句
         String s =  userServletProxy.doGet();//调用代理对象的 doGet方法
        System.out.println("代理对象得到的方法返回值为:"+s);
    }
}

/**
 * class UserServlet$$EnhancerByCGLIB$$18ee3650 extends  UserServlet{
 *     doGet(){
 *         super.doGet();
 *
 *     }
 * }
 */

class CglibHandler implements MethodInterceptor{

    private UserServlet  target;
    public void setUserServlet(UserServlet target){
        this.target = target;
    }

    /**
     *调用代理对象的任意方法，intercept方法就会被执行。。
     * @param o
     * @param method   代理调用的方法包装成method
     * @param args     代理调用的方法参数包装成数组
     * @param methodProxy   方法的代理对象
     * @return         方法返回值
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理对象调用的方法名称为:"+method.getName());

        //调用被代理对象的方法
       Object retrunVal=  method.invoke(target,args);
        System.out.println("被代理对象方法的返回值为:"+retrunVal);


        return "执行失败了";
    }
}


class CglibHandler2 implements MethodInterceptor{

    /**
     *调用代理对象的任意方法，intercept方法就会被执行。。
     * @param o
     * @param method   代理调用的方法包装成method
     * @param args     代理调用的方法参数包装成数组
     * @param methodProxy   方法的代理对象
     * @return         方法返回值
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}


