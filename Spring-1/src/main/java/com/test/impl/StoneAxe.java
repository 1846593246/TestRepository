package com.test.impl;

import com.test.Axe;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component(value = "StoneAxe")
public class StoneAxe implements Axe {
    /**
     * 1
     */
    public void chop() {
        System.out.println("用石斧伐木好累");
    }
}
