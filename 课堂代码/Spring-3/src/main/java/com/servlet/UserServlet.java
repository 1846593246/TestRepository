package com.servlet;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


//@Component  //相当于<bean id=userServlet class="com.servlet.UserServlet">
                    //<property name=us ref="userService">
                 //</bean>
            //默认情况下，Bean的id就是类名的首字母小写 id=userServlet
            //也可以为组件设置value属性  @Component(value = "userServlet")
@Controller  //id="userServlet"
public class UserServlet {

    public  UserServlet(){
        System.out.println("UserServlet的构造方法被调用");
    }


    @Autowired   //依赖注入，默认按类型注入UserService的实现类,当UserService有多个实现类时，必需指定注入哪个实现类
    @Qualifier("userServicenewImpl")//限定只注入id=userServiceImpl的类
    UserService us;//null;



    public String doGet(){
        //调用 UserService的save方法    UserServlet依赖Uservice的
        System.out.println("UserServlet 。。。doGet方法被调用");
      //  us.save("xxx");
        return  "执行成功";
    }
}
