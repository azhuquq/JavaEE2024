package com.azhuquq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseTeacherTimetable {
    private String cid;
    private String cname;
    private int flag;

    private int tid;
    private String tname;
    private String tpassword;
    private int tright;
    private int tflag;

    private String classroom;
    private String classtime;
}
