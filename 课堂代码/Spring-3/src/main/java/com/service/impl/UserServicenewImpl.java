package com.service.impl;

import com.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //id=userServicenewImpl
public class UserServicenewImpl implements UserService {


    public int save(Object object) {
        System.out.println("UserServicenewImpl 的save方法被调用");
        return 0;
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
}
