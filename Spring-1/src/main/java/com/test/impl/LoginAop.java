package com.test.impl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component(value = "LoginAop")
@Aspect
public class LoginAop {

    @Pointcut("execution(* com.test.impl.GoodsService.*(..)))")
    public void cutPoint(){

    }
    @Before(value = "cutPoint()")
    public void showLog(){
        System.out.println("日志开始.....");
    }
}
