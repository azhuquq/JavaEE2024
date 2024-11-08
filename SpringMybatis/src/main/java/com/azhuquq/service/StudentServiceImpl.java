package com.azhuquq.service;

import com.azhuquq.mapper.StudentMapper;
import com.azhuquq.pojo.Student;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Student> queryStuAll() {
        return sqlSessionTemplate.getMapper(StudentMapper.class).queryStuAll();
    }

    @Override
    public int insertStudent(Student student) {
        return sqlSessionTemplate.getMapper(StudentMapper.class).insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return sqlSessionTemplate.getMapper(StudentMapper.class).updateStudent(student);
    }

    @Override
    public int deleteStudent(String sid) {
        return sqlSessionTemplate.getMapper(StudentMapper.class).deleteStudent(sid);
    }
}
