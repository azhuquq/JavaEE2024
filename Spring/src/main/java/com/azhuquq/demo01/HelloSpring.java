package com.azhuquq.demo01;

public class HelloSpring {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HelloSpring() {
        System.out.println("无参的构造方法被调用");
    }

    public HelloSpring(String name, int age) {
        System.out.println("有参的构造方法被调用");
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Hello Spring " + name + ' ' + age);
    }
}
