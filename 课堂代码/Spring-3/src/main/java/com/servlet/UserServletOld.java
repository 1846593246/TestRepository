package com.servlet;

import com.service.UserService;
import com.service.impl.UserServiceImpl;

public class UserServletOld {


    public UserServletOld(){
        System.out.println("UserServlet的构造方法被调用");
    }

    UserService userService;//null;





    public void doGet(){
        //调用 UserService的save方法    UserServlet依赖Uservice的

        userService.save("xxx");
    }
}
