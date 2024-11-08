package com.azhuquq.service;

import com.azhuquq.pojo.Student;

import java.util.List;

public interface StudentService {
    public List<Student> queryStuAll();
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(String sid);
}
