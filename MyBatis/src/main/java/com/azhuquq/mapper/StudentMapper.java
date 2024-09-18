package com.azhuquq.mapper;

import com.azhuquq.pojo.Student;

import java.util.List;

public interface StudentMapper {
    public List<Student> queryStuAll();
    public Student queryStuBySid(String sid);
}
