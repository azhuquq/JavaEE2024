package com.azhuquq.service;

import com.azhuquq.pojo.Course;

import java.util.List;

public interface CourseService {
    public List<Course> queryCourseAll();

    public int insertCourse(Course course);

    public int updateCourse(Course course);

    public int deleteCourse(String cid);
}
