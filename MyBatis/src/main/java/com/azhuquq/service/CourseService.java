package com.azhuquq.service;

import com.azhuquq.pojo.Course;
import com.azhuquq.pojo.CourseExtend;
import com.azhuquq.pojo.CourseTeacherTimetable;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface CourseService {
    public List<Course> queryCourseAll();

    public int insertCourse(Course course);

    public int updateCourse(Course course);

    public int deleteCourse(String cid);

    public List<Course> queryCourseByCname1(String cname);

    public List<Course> queryCourseByCname2(String cname);

    public List<String> queryTnameByCid(String cid);

//    public List<CourseTeacherTimetable> queryInfoByCid(String cid);
    public List<CourseExtend> queryInfoByCid(String cid);
}
