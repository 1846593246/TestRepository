package com.aop;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component  //纳入spring容器
@Aspect //标注该类为切面类
public class LoginAop {

    //定义切入点表达式
    //以下表达式表示拦截    com.service.UserService 类中的任意方法
    @Pointcut("execution(public int  com.service.UserService.*(..) )")
    public void poingCut(){};


    @Before(value = "poingCut()")
    public void addLog(){
        //在调用com.dao包中的任意类的任意方法前，都打印以下语句
        System.out.println("添加日志。。。。。。");
    }

}
