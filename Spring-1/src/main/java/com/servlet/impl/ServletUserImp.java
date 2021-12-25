package com.servlet.impl;

import com.service.UserService;
import com.service.impl.UserServiceImpl;

/**
 * @author Administrator
 */
public class ServletUserImp {

    UserService userService;

    public void setUserService(UserService userService){
        this.userService = userService;
    }

}
