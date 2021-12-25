package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 */
@Component(value = "ErrorServiceLog")
@Aspect
public class ErrorServiceLog {
    FileOutputStream fileOutputStream;

    {
        try {
            fileOutputStream = new FileOutputStream("d:ErrorServiceLog.txt", true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Pointcut("execution(* com.service.*.*(..))")
    public void pointCut() {

    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("记录开始");

        String className = proceedingJoinPoint.getTarget().getClass().getName();
        Object[] pointArgs = proceedingJoinPoint.getArgs();
        String methodName = proceedingJoinPoint.getSignature().getName();


        try {
            Object returnVal = proceedingJoinPoint.proceed();
            return returnVal;

        } catch (Throwable throwable) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = format.format(new Date());
            String errorInfo = "\r\n错误的发生时间:" + time +
                    "\r\n类:" + className + "中的" + methodName + "方法执行时出现了异常,异常原因为:" + throwable.getMessage() + "\r\n";
            fileOutputStream.write(errorInfo.getBytes());

            throw throwable;
//            throwable.printStackTrace();
        } finally {

        }


    }

}
