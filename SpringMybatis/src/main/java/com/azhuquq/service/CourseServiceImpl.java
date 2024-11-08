package com.azhuquq.service;

import com.azhuquq.mapper.CourseMapper;
import com.azhuquq.pojo.Course;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public CourseServiceImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Course> queryCourseAll() {
        return sqlSessionTemplate.getMapper(CourseMapper.class).queryCourseAll();
    }
}
