package com.azhuquq.demo06;

public class StudentServiceImpl implements StudentService {
    @Override
    public void query() {
        System.out.println("实现了query方法......");
    }

    @Override
    public void insert() {
        System.out.println("实现了insert方法......");
    }

    @Override
    public void delete() {
        System.out.println("实现了delete方法......");
    }

    @Override
    public void update() {
        System.out.println("实现了update方法......");
    }

    public void log() {
        System.out.println("日志输出......");
    }
}
