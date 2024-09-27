package com.azhuquq.service;

import com.azhuquq.mapper.StudentMapper;
import com.azhuquq.pojo.Student;
import com.azhuquq.util.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> queryStuAll() throws IOException {
        List<Student> list1 = null;
        List<Student> list2 = null;
        // 2024/09/27 课程 测试缓存机制
        // 测试一级缓存与二级缓存的区别
//        try (SqlSession session = DBUtil.getSqlSession()) {
//            StudentMapper mapper = session.getMapper(StudentMapper.class);
//            list1 = mapper.queryStuAll();
//            System.out.println("-------- list 1 --------");
////            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
////            list2 = studentMapper.queryStuAll();
////            System.out.println("-------- list 2 --------");
//        }
//        try (SqlSession session = DBUtil.getSqlSession()) {
////            StudentMapper mapper = session.getMapper(StudentMapper.class);
////            list1 = mapper.queryStuAll();
////            System.out.println("-------- list 1 --------");
//            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//            list2 = studentMapper.queryStuAll();
//            System.out.println("-------- list 2 --------");
//        }
        // 一级缓存是基于SqlSession来缓存的，二级缓存需要到Mapper.xml里面使用<cache />标签开启
        // 测试二级缓存开启状态下
        SqlSession session1 = DBUtil.getSqlSession();
        StudentMapper mapper = session1.getMapper(StudentMapper.class);
        list1 = mapper.queryStuAll();
        System.out.println("-------- list 1 --------");
        SqlSession session2 = DBUtil.getSqlSession();
        StudentMapper studentMapper = session2.getMapper(StudentMapper.class);
        list2 = studentMapper.queryStuAll();
        System.out.println("-------- list 2 --------");
        // 二级缓存是基于SqlSessionFactory的，它的缓存是存储在SqlSessionFactory级别的。
        return list1;
    }

    @Override
    public Student queryStuBySid(String sid) throws IOException {
        Student student = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            student = mapper.queryStuBySid(sid);
        }
        return student;
    }

    @Override
    public List<Student> queryStuBySname(String sname) throws IOException {
        List<Student> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            list = mapper.queryStuBySname(sname);
        }
        return list;
    }

    @Override
    public Vector<Student> queryStuByOthers(String sname, int sflag) throws IOException {
        Vector<Student> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            list = mapper.queryStuByOthers(sname, sflag);
        }
        return list;
    }

    @Override
    public List<Student> queryStuByIf(Map<String, Object> map) {
        List<Student> list = null;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            list = mapper.queryStuByIf(map);
        }
        return list;
    }

    @Override
    public int updateStuBySet(Map<String, Object> map) {
        int temp = 0;
        try (SqlSession session = DBUtil.getSqlSession()) {
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            temp = mapper.updateStuBySet(map);
            session.commit();
        }
        return temp;
    }
}
