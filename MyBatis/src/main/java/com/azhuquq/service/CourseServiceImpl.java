package com.azhuquq.service;

import com.azhuquq.mapper.CourseMapper;
import com.azhuquq.pojo.Course;
import com.azhuquq.util.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Override
    public List<Course> queryCourseAll() {
        List<Course> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            list = mapper.queryCourseAll();
        }
        return list;
    }

    @Override
    public int insertCourse(Course course) {
        int flag = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            flag = mapper.insertCourse(course);
            session.commit();  // 提交事务
        }
        return flag;
    }

    public int updateCourse(Course course) {
        int flag = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            flag = mapper.updateCourse(course);
            session.commit();
        }
        return flag;
    }

    public int deleteCourse(String cid) {
        int flag = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            flag = mapper.deleteCourse(cid);
            session.commit();
        }
        return flag;
    }
}
