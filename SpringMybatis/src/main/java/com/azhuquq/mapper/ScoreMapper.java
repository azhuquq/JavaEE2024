package com.azhuquq.mapper;

import com.azhuquq.pojo.Score;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ScoreMapper {
    @Select("select * from score")
    public List<Score> queryScoreAll();

    @Insert("insert into score values(#{sid},#{cid},#{score},#{flag})")
    public int insertScore(Score score);

    @Update("update score set score=#{score},flag=#{flag} where sid=#{sid} and cid=#{cid}")
    public int updateScore(Score score);

    @Delete("delete from score where sid=#{sid} and cid=#{cid}")
    public int deleteScore(String sid, String cid);
}
