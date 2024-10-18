package com.azhuquq.demo06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
//        DynamicProxy dynamicProxy = context.getBean("proxy", DynamicProxy.class);
//        StudentService proxy = (StudentService) dynamicProxy.getProxy();
//        StudentServiceImplDynamicProxy proxy1 = context.getBean("proxy", StudentServiceImplDynamicProxy.class);
        studentService.insert();
        studentService.delete();
        studentService.query();
        studentService.update();

//        StudentService service = new StudentServiceImpl();
//        StudentServiceImplProxy proxy = new StudentServiceImplProxy();
//        proxy.setStudentService(service);
//        proxy.insert();
//        proxy.delete();
//        proxy.query();
//        proxy.update();
    }
}
