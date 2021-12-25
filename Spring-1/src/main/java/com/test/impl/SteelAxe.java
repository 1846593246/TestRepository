package com.test.impl;

import com.test.Axe;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component(value = "SteelAxe")
public class SteelAxe implements Axe {
    /**
     * 1
     */
    public void chop() {
        System.out.println("用钢斧伐木很爽");

    }
}
