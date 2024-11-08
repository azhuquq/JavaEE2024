package com.azhuquq.mapper;

import com.azhuquq.pojo.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CourseMapper {
    @Select("select * from course")
    public List<Course> queryCourseAll();

    @Insert("insert into course values(#{cid},#{cname},#{flag})")
    public int insertCourse(Course course);

    @Update("update course set cname=#{cname},flag=#{flag} where cid=#{cid}")
    public int updateCourse(Course course);

    @Delete("delete from course where cid=#{cid}")
    public int deleteCourse(String cid);
}
