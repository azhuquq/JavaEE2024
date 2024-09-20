package com.azhuquq.mapper;

import com.azhuquq.pojo.Teacher;

import java.util.Map;

public interface TeacherMapper {
    // 新增一条记录
    public int insertTeacher(Teacher teacher);

    // 修改一条记录
    public int updateTeacher(Teacher teacher);

    // 修改密码
    public int updateTeacherPassword(Map<String, Object> map);
}
