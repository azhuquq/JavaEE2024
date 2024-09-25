package com.azhuquq.mapper;

import com.azhuquq.pojo.Student;
import com.azhuquq.service.StudentService;
import com.azhuquq.service.StudentServiceImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void test03() throws IOException {
        for (Student student : service.queryStuBySname("a")) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void test04() throws IOException {
        for (Student student : service.queryStuByOthers("a", 1)) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void test05() {
        Map<String, Object> map = new HashMap<>();
        map.put("sid", "s00");
        map.put("sname", "admin");
        map.put("spassword", "123");
        map.put("sright", "1");
        map.put("sflag", "1");
        for (Student student : service.queryStuByIf(map)) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void test06() {
        Map<String, Object> map = new HashMap<>();
        map.put("sid", "s00");
        map.put("sname", "admin");
        map.put("spassword", "1234");
        map.put("sright", "1");
        map.put("sflag", "1");
        System.out.println(service.updateStuBySet(map));
    }
}
