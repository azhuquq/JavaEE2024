package com.azhuquq.service;

import com.azhuquq.pojo.Student;

import java.io.IOException;
import java.util.List;

public interface StudentService {
    public List<Student> queryStuAll() throws IOException;
    public Student queryStuBySid(String sid) throws IOException;
}
