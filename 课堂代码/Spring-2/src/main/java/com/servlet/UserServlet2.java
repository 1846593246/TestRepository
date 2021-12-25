package com.servlet;

import com.service.UserService;

public class UserServlet2 {


    public UserServlet2(){
        System.out.println("UserServlet的构造方法被调用");
    }

    UserService us;//null;

    public  UserServlet2(UserService us){
        System.out.println("UserServlet2的 带参数的  构造方法被调用");
        this.us  =us;
    }






    public void doGet(){
        //调用 UserService的save方法    UserServlet依赖Uservice的

        us.save("xxx");
    }
}
