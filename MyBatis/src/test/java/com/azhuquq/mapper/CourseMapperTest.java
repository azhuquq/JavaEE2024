package com.azhuquq.mapper;

import com.azhuquq.pojo.Course;
import com.azhuquq.service.CourseService;
import com.azhuquq.service.CourseServiceImpl;
import org.junit.Test;

import java.io.IOException;

public class CourseMapperTest {

    CourseService service = new CourseServiceImpl();

    @Test
    public void test01() throws IOException {
        for (Course course : service.queryCourseAll()) {
            System.out.println(course.toString());
        }
    }

    @Test
    public void test02() {
        Course course = new Course("c06", "Java123", 1);
        System.out.println(service.insertCourse(course));
    }

    @Test
    public void test03() {
        Course course = new Course("c06", "jjjjjj", 1);
        System.out.println(service.updateCourse(course));
    }

    @Test
    public void test04() {
        System.out.println(service.deleteCourse("c05"));
    }
}
