package com.azhuquq.mapper;

import com.azhuquq.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
    @Select("select * from student")
    public List<Student> queryStuAll();

    @Insert("insert into student values(#{sid},#{sname},#{spassword},#{sright},#{sflag})")
    public int insertStudent(Student student);

    @Update("update student set sname=#{sname},spassword=#{spassword},sright=#{sright},sflag=#{sflag} where sid=#{sid}")
    public int updateStudent(Student student);

    @Delete("delete from student where sid=#{sid}")
    public int deleteStudent(String sid);
}
