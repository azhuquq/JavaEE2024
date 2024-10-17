package com.azhuquq.demo04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Education education = context.getBean("education", Education.class);
        education.show();
//        Student student = new Student();
//        Teacher teacher = new Teacher();
//        Education education = new Education();
//        education.setTeacher(teacher);
//        education.setStudent(student);
//        education.show();
    }
}
