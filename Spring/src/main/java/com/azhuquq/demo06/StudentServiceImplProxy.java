package com.azhuquq.demo06;

public class StudentServiceImplProxy implements StudentService {
    StudentService studentService; //被代理对象

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void query() {
        log();
        studentService.query();
    }

    @Override
    public void insert() {
        log();
        studentService.insert();
    }

    @Override
    public void delete() {
        log();
        studentService.delete();
    }

    @Override
    public void update() {
        log();
        studentService.update();
    }

    public void log() {
        System.out.println("日志输出......");
    }
}
