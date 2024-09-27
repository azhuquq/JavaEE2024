package com.azhuquq.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TimetableMapper {
    // 提出需求：已知cid，查询谁上这门课，也就是查询tid
    // 需求更变：继续通过tid查询老师的名字
    @Select("select tid from timetable where cid = #{cid}")
    public List<Integer> queryTidByCid(String cid);
}
