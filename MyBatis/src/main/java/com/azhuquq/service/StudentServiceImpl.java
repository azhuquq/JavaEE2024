package com.azhuquq.service;

import com.azhuquq.mapper.StudentMapper;
import com.azhuquq.pojo.Student;
import com.azhuquq.util.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> queryStuAll() throws IOException {
        List<Student> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            list = mapper.queryStuAll();
        }
        return list;
    }

    @Override
    public Student queryStuBySid(String sid) throws IOException {
        Student student = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            student = mapper.queryStuBySid(sid);
        }
        return student;
    }

    @Override
    public List<Student> queryStuBySname(String sname) throws IOException {
        List<Student> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            list = mapper.queryStuBySname(sname);
        }
        return list;
    }

    @Override
    public Vector<Student> queryStuByOthers(String sname, int sflag) throws IOException {
        Vector<Student> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            list = mapper.queryStuByOthers(sname, sflag);
        }
        return list;
    }
}
