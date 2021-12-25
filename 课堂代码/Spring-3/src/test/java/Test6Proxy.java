import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.service.impl.UserServicenewImpl;
import org.junit.Test;
import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

public class Test6Proxy {


    @Test
    public  void t1(){
        //产生一个UserServiceImpl类的对象，此时调用UserServiceImpl中方法，需要在调用这些方法前通过代理类先记录日志，再调用UserServiceImpl中方法的方法
        UserServiceImpl userServiceImpl = new UserServiceImpl(); //被代理对象

        UserServicenewImpl userServicenew = new UserServicenewImpl();
       // userService.save("x");

       // userService.deleteById("xx");


       UserServiceHandler handler = new UserServiceHandler();

        //JDK动态代理 ,为某个类动态产生代理类，用Proxy.newProxyInstance方法动态产生第二个参数对象的类的代理类

        //第三个参数是调用由Proxy产生代理对象时的任意方法时，都会回调handler中的invoke方法
      UserService userServiceProxy =  (UserService) Proxy.newProxyInstance(
              userServiceImpl.getClass().getClassLoader(),
              userServiceImpl.getClass().getInterfaces(),handler );


     // handler.setTarget(userServiceImpl);//将userServiceImpl做为被代理对象
        handler.setTarget(userServicenew);

        System.out.println("由JDK动态产生的代理类的类型为:"+userServiceProxy.getClass().getName());

         userServiceProxy.update("xxx");
         userServiceProxy.save("save张三");
         userServiceProxy.deleteById("111");
        userServiceProxy.query("query");


    }
}

class  UserServiceHandler implements InvocationHandler{

    private  UserService target;
    public void setTarget(UserService target){//传入被代理对象
        this.target= target;
    }


    /**
     *
     * @param proxy  把代理传入进来了
     * @param method   把代理对象调用的方法对应的method对象传入进来了
     * @param args     把代理对象调用的方法的参数传入进来了
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      //  System.out.println("调用了代理对象的方法,方法名为:"+method.getName());
      //  System.out.println("方法的参数为:"+ Arrays.toString(args));
        Long beginTime = System.currentTimeMillis();

        if (method.getName().equals("save")){

        }
        /**
         * @Before: 前置通知, 在方法执行之前执行
         * @After: 后置通知, 在方法执行之后执行 最终通知
         * @AfterRunning: 返回通知, 在方法返回结果之后执行 方法未抛出异常
         * @AfterThrowing: 异常通知, 在方法抛出异常之后
         */
        Object returnValue  = null;
        System.out.println("前置通知");
        try {
             returnValue = method.invoke(target, args); //调用被代理对象的真实方法
            System.out.println("返回通知 AfterRunning");
        }catch (Exception e){
            System.out.println("异常通知");
        }finally {
            System.out.println("后置通知");
        }

        Long endTIme = System.currentTimeMillis();
      //  System.out.println("方法名为:"+method.getName()+"执行时间为:"+ (endTIme-beginTime));
        //在此处应该调用被代理对象的相应方法
        //if (method.getName().equals("save")){
        //    target.save()
       // }

        return returnValue;//将被代理对象的方法返回 值返回给代理对象
    }
}

//模拟JDK动态代理产生的类的情况
/**
class  $Proxy4 implements UserService{//代理对象。
    UserServiceImpl userService; //被代理对象
    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }


    public int save(Object object) {
        System.out.println("记录日志");

        return userService.save(object);
    }

    public List query(Object object) {
        return null;
    }

    public int update(Object object) {
        return 0;
    }

    public int deleteById(String id) {
        return 0;
    }
}*/

