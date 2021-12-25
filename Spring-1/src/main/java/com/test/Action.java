package com.test;

import java.util.List;

/**
 * @author Administrator
 */
public interface Action {
    /**
     * food
     * @param food
     */
    public void eat(String food);


    /**
     * voice
     * @param voice
     */
    public void speak(String voice );


    /**
     * s
     * @param list
     */
    public List show(List list);
}
