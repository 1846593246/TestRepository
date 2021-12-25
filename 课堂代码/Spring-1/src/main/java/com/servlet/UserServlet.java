package com.servlet;

import com.service.UserService;

public class UserServlet {


    public  UserServlet(){
        System.out.println("UserServlet的构造方法被调用");
    }

    UserService us;//null;


    public void setUs(UserService userService){
        System.out.println("setUserService方法被 调用了");
            this.us = userService;
    }


    public void doGet(){
        //调用 UserService的save方法    UserServlet依赖Uservice的

        us.save("xxx");
    }
}
