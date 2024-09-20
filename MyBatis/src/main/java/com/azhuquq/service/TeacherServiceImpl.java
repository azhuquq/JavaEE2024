package com.azhuquq.service;

import com.azhuquq.mapper.TeacherMapper;
import com.azhuquq.pojo.Teacher;
import com.azhuquq.util.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public int insertTeacher(Teacher teacher) {
        int temp = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            TeacherMapper mapper = session.getMapper(TeacherMapper.class);
            temp = mapper.insertTeacher(teacher);
            session.commit();
        }
        return temp;
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        int temp = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            TeacherMapper mapper = session.getMapper(TeacherMapper.class);
            temp = mapper.updateTeacher(teacher);
            session.commit();
        }
        return temp;
    }

    @Override
    public int updateTeacherPassword(Map<String, Object> map) {
        int temp = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            TeacherMapper mapper = session.getMapper(TeacherMapper.class);
            temp = mapper.updateTeacherPassword(map);
            session.commit();
        }
        return temp;
    }
}
