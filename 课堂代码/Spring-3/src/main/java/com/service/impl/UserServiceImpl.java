package com.service.impl;

import com.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    public int save(Object object) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //  System.out.println("日志:  save被调用了。。传递的参数为:"+object);
        System.out.println(" 核心业务逻辑：UserServiceImpl的save方法被调用了...");

        return 0;

    }

    public List query(Object object) {

       // System.out.println("日志:  query被调用了。。传递的参数为:"+object);
        System.out.println(" 核心业务逻辑：UserServiceImpl的query方法被调用了...");
        return null;
    }

    public int update(Object object) {

      //  System.out.println("日志:  update被调用了。。传递的参数为:"+object);
        System.out.println(" 核心业务逻辑：UserServiceImpl的update方法被调用了...");
        return 0;
    }

    public int deleteById(String id) {

       // System.out.println("日志: delete被调用了。。传递的参数为:"+id);
        System.out.println(" 核心业务逻辑：UserServiceImpl的delete方法被调用了...");
        return 0;
    }


}
