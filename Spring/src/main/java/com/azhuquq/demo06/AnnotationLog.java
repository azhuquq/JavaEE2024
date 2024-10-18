package com.azhuquq.demo06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationLog {
    @Before("execution(* com.azhuquq.demo06..*(..))")
    public void beforeLog() {
        System.out.println("[Debug 999 前置通知]" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @After("execution(* com.azhuquq.demo06..*(..))")
    public void afterLog() {
        System.out.println("[Debug 999 后置通知]" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}