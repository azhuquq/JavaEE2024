package com.azhuquq.mapper;

import com.azhuquq.pojo.Student;
import com.azhuquq.service.StudentService;
import com.azhuquq.service.StudentServiceImpl;
import org.junit.Test;

import java.io.IOException;

public class StudentMapperTest {
    StudentService service = new StudentServiceImpl();

    @Test
    public void test01() throws IOException {
        for (Student student : service.queryStuAll()) {
            System.out.println(student.toString());
        }
    }
    @Test
    public void test02() throws IOException {
        System.out.println(service.queryStuBySid("s00").toString());
    }
}
