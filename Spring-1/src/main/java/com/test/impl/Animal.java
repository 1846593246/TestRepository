package com.test.impl;

import com.test.Action;

import java.util.List;

/**
 * @author Administrator
 */
public class Animal implements Action {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    /**
     * food
     *
     * @param food
     */
    public void eat(String food) {
        System.out.println(this.name+"吃"+food);
    }

    /**
     * s
     *
     * @param list
     */
    public List show(List list) {
        System.out.println("---"+list);
        return list;
    }

    /**
     * voice
     *
     * @param voice
     */
    public void speak(String voice) {

        System.out.println(this.name+""+voice);
    }
}
