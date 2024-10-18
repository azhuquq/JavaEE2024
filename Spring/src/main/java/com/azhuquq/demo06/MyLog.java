package com.azhuquq.demo06;

public class MyLog {
    public void beforeLog() {
        System.out.println("[Debug 666 前置通知]" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void afterLog() {
        System.out.println("[Debug 666 后置通知]" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
