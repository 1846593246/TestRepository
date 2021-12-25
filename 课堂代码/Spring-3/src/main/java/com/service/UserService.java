package com.service;

import java.util.List;

public interface UserService {

    public int save(Object object);


    public List query(Object object);


    public int update(Object object);

    public int deleteById(String id);

}
