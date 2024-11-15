package com.azhuquq.mapper;

import com.azhuquq.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface TeacherMapper {
    // 新增一条记录
    public int insertTeacher(Teacher teacher);

    // 修改一条记录
    public int updateTeacher(Teacher teacher);

    // 修改密码
    public int updateTeacherPassword(Map<String, Object> map);

    // 删除
    public int deleteTeacherByTid(int tid);

    @Select("select tname from teacher where tid = #{tid}")
    public String queryTnameByTid(int tid);
}
