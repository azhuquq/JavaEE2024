package com.azhuquq.service;

import com.azhuquq.mapper.StudentMapper;
import com.azhuquq.pojo.Student;
import com.azhuquq.util.DBUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
}
