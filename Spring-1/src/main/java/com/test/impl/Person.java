package com.test.impl;

import com.test.Axe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component(value = "Person")
public class Person {
    @Autowired(required = true)
            @Qualifier("SteelAxe")
    Axe axe;


    public void show(){
        axe.chop();
    }

//    public Person() {
//        axe.chop();
//    }
}
