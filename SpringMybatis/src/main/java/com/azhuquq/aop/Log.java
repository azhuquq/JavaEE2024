package com.azhuquq.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class Log {

    // 定义一个切点，表示在指定包中的所有增、删、查、改方法上执行通知
    @Pointcut("execution(* com.azhuquq.service.*.*(..))") // 括号中的表达式定义了目标方法的匹配规则
    public void logPointcut() {}

    // 前置通知
    @Before("logPointcut()")
    public void beforeMethod() {
        System.out.println("方法执行前日志: 方法开始执行...");
    }

    // 后置通知
    @After("logPointcut()")
    public void afterMethod() {
        System.out.println("方法执行后日志: 方法执行完毕...");
    }
}
