package com.azhuquq.service;

import com.azhuquq.pojo.Teacher;

import java.util.Map;

public interface TeacherService {
    public int insertTeacher(Teacher teacher);

    public int updateTeacher(Teacher teacher);

    public int updateTeacherPassword(Map<String, Object> map);
}
