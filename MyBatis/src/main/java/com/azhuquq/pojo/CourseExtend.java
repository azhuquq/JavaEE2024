package com.azhuquq.pojo;

public class CourseExtend extends Course {
    @Override
    public String toString() {
        return "CourseExtend{" + super.toString() +
                "teacher=" + teacher +
                ", timetable=" + timetable +
                '}';
    }

    private Teacher teacher;
    private Timetable timetable;
}
