package com.azhuquq.mapper;

import com.azhuquq.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public interface StudentMapper {
    public List<Student> queryStuAll();
//
//    public Student queryStuBySid(String sid);
//
//    // 模糊查询
//    public List<Student> queryStuBySname(String sname);
//
//    // 多条件查询
//    public Vector<Student> queryStuByOthers(@Param("name") String sname, @Param("flag") int sflag);
//
//    // 提出需求：有多个条件输入，进行查询，条件的个数是不确定的
//    public List<Student> queryStuByIf(Map<String, Object> map);
//
//    // 提出需求：有多个条件输入，进行更新，条件的个数是不确定的
//    public int updateStuBySet(Map<String, Object> map);
}
