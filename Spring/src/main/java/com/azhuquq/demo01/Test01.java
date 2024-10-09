package com.azhuquq.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从spring的上下文对象获取我们要用的那个类的实例
        // HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
        HelloSpring helloSpring = context.getBean("helloSpring", HelloSpring.class);
        HelloJava helloJava = context.getBean("helloJava", HelloJava.class);
        helloSpring.show();
        helloJava.show();

//         HelloSpring helloSpring1 = new HelloSpring();
//         HelloJava helloJava1 = new HelloJava();
//         helloSpring1.show();
//         helloJava1.show();
    }
}
