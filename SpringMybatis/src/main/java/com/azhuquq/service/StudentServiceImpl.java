package com.azhuquq.service;

import com.azhuquq.mapper.StudentMapper;
import com.azhuquq.pojo.Student;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    // 现在没有工具类，我们要拿SqlSessionFactory，需要给出成员变量的定义
    SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Student> queryStuAll() {
        return sqlSessionTemplate.getMapper(StudentMapper.class).queryStuAll();
    }
}
