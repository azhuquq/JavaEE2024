package com.azhuquq.service;

public class StudentServiceImpl implements StudentService{
    @Override
    public boolean login(String sname, String spassword) {
        // 这里原本是要去查数据库的，这里假设已经查到
        System.out.println("22222222222222222");
        System.out.println(sname += "," + spassword);
        return true;
    }
}
