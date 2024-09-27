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

    // 在MyBatis中使用#{}是预编译的，而${}不是，使用${}有sql注入的风险
    @Select("select * from course where cname = #{cname}")
    public List<Course> queryCourseByCname1(String cname);

    @Select("select * from course where cname = ${cname}")
    public List<Course> queryCourseByCname2(String cname);

    @Insert("insert into course values(#{cid},#{cname},#{flag})")
    public int insertCourse(Course course);

    @Update("update course set cname=#{cname},flag=#{flag} where cid=#{cid}")
    public int updateCourse(Course course);

    @Delete("delete from course where cid=#{cid}")
    public int deleteCourse(String cid);

    public List<String> queryTnameByCid(String cid);
}
