package com.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Component  //纳入spring <bean destory-method="destory" id="serviceErrorLog" class="com.aop.ServiceErrorLog">
//配置spring容器被关闭时，调用该类的哪个方法，实现资源的释放
@Aspect //定义切面类
public class ServiceErrorLog { //service层的方法被调用，我们记录异常日志
    //@Bean(destroyMethod = "(destory)")
    //public void destory(){

   // }

    /**
     * 切入点为 com.service包中的任意类的任意方法做为切入点
     */
    @Pointcut("execution(* com.service.*.*(..))")
    public void pointCut(){}


    //通知
   // @Before()
  //  @After()
   // @AfterReturning
   // @AfterThrowing


    FileOutputStream fileOutputStream ;

    public  ServiceErrorLog(){
        try {
            fileOutputStream = new FileOutputStream("d:\\error.log",true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }



    @Around(value = "pointCut()")//环绕通知,可以完成前置，后置，异常和最终通知
    /**
     * ProceedingJoinPoint joinPoint 把连接点对象传递过来，连接点对象包含被调用的方法名称，方法参数等信息
     */
    public Object around(ProceedingJoinPoint joinPoint)throws  Throwable{

        Object[] args =   joinPoint.getArgs();//方法的参数，
        String methodName =   joinPoint.getSignature().getName();;//方法名称
        String className =  joinPoint.getTarget().getClass().getName();//类名
        System.out.println("方法的参数为:"+ Arrays.toString(args));
        System.out.println("方法的名称为:"+methodName);

        //jdk  invoke (method)
        //调用被代理对象的真实方法
        try {
            //前置通知
           Object object=   joinPoint.proceed();//调用被代理对象的方法 ,返回值为被代理对象返回的结果
            //返回通知
            return object;
        } catch (Throwable throwable) {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = sdf.format(new Date());
            String errorInfo = "\r\n错误的发生时间:"+date +"类:"+className+"中的"+methodName+"方法执行时出现了异常,异常原因为:"+throwable.getMessage();

            fileOutputStream.write(errorInfo.getBytes());



        //    throwable.printStackTrace();
            //异常通知
            throw throwable;//把异常继续往外抛出。。
        }finally {
            //最终通知
        }


    }

}
