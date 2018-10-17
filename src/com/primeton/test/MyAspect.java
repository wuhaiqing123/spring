package com.primeton.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before(value = "execution(* com.primeton.test.OrderDao.save(..))")
    public void hello(){
        System.out.println("helloworld");
    }

    @Around("execution(* com.primeton.test.OrderDao.update(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前通知");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕后通知"+proceed);
        return proceed;
    }
}
