package com.azhuquq.service;

import com.azhuquq.mapper.CourseMapper;
import com.azhuquq.mapper.TeacherMapper;
import com.azhuquq.mapper.TimetableMapper;
import com.azhuquq.pojo.Course;
import com.azhuquq.pojo.CourseExtend;
import com.azhuquq.pojo.CourseTeacherTimetable;
import com.azhuquq.util.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
    public List<Course> queryCourseByCname1(String cname) {
        List<Course> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            list = mapper.queryCourseByCname1(cname);
        }
        return list;
    }

    @Override
    public List<Course> queryCourseByCname2(String cname) {
        List<Course> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            list = mapper.queryCourseByCname2(cname);
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

    @Override
    public int updateCourse(Course course) {
        int flag = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            flag = mapper.updateCourse(course);
            session.commit();
        }
        return flag;
    }

    @Override
    public int deleteCourse(String cid) {
        int flag = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            flag = mapper.deleteCourse(cid);
            session.commit();
        }
        return flag;
    }

    @Override
    public List<String> queryTnameByCid(String cid) {
        // solution 1
//        List<String> list = new LinkedList<>();
//        try (SqlSession session = DBUtil.getSqlSession()) {
//            TimetableMapper mapper1 = session.getMapper(TimetableMapper.class);
//            TeacherMapper mapper2 = session.getMapper(TeacherMapper.class);
//            List<Integer> tids = mapper1.queryTidByCid(cid);
//            for (Integer tid : tids) {
//                list.add(mapper2.queryTnameByTid(tid));
//            }
//        }
//        return list;
        // solution 2
        List<String> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            list = mapper.queryTnameByCid(cid);
        }
        return list;
    }

    @Override
    public List<CourseExtend> queryInfoByCid(String cid) {
        List<CourseExtend> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            CourseMapper mapper = session.getMapper(CourseMapper.class);
            list = mapper.queryInfoByCid(cid);
        }
        return list;
    }
}
