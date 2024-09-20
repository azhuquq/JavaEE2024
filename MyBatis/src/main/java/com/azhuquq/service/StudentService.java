package com.azhuquq.service;

import com.azhuquq.pojo.Student;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

public interface StudentService {
    public List<Student> queryStuAll() throws IOException;

    public Student queryStuBySid(String sid) throws IOException;

    public List<Student> queryStuBySname(String sname) throws IOException;

    public Vector<Student> queryStuByOthers(String sname, int sflag) throws IOException;
}
