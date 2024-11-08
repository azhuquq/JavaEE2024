package com.azhuquq.mapper;

import com.azhuquq.pojo.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher")
    public List<Teacher> queryTeacherAll();

    @Insert("insert into teacher values(#{tid},#{tname},#{tpassword},#{tright},#{tflag})")
    public int insertTeacher(Teacher teacher);

    @Update("update teacher set tname=#{tname},tpassword=#{tpassword},tright=#{tright},tflag=#{tflag} where tid=#{tid}")
    public int updateTeacher(Teacher teacher);

    @Delete("delete from teacher where tid=#{tid}")
    public int deleteTeacher(String tid);
}
