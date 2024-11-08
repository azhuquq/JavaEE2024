package com.azhuquq.mapper;

import com.azhuquq.pojo.Timetable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TimetableMapper {
    @Select("select * from timetable")
    public List<Timetable> queryTimetableAll();

    @Insert("insert into timetable values(#{tid},#{cid},#{classroom},#{classtime},#{flag})")
    public int insertTimetable(Timetable timetable);

    @Update("update timetable set classroom=#{classroom},classtime=#{classtime},flag=#{flag} where tid=#{tid} and cid=#{cid}")
    public int updateTimetable(Timetable timetable);

    @Delete("delete from timetable where tid=#{tid} and cid=#{cid}")
    public int deleteTimetable(String tid, String cid);
}
