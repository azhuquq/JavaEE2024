package com.azhuquq.mapper;

import com.azhuquq.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Vector;

public interface StudentMapper {
    public List<Student> queryStuAll();

    public Student queryStuBySid(String sid);

    // 模糊查询
    public List<Student> queryStuBySname(String sname);

    // 多条件查询
    public Vector<Student> queryStuByOthers(@Param("name") String sname, @Param("flag") int sflag);
}
