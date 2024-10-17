package com.azhuquq.demo06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StudentServiceImplDynamicProxy implements InvocationHandler {
    // 前提：你必须知道你要代理哪个类，也就是需要知道被代理对象是谁
    StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    // 通过一个方法去拿到代理对象
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), studentService.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(studentService, args);
    }

    // 方法的增强，就是你要横切进系统的功能
    public void log(String msg) {
        System.out.println("[Debug]" + msg + "方法日志输出.......");
    }
}
