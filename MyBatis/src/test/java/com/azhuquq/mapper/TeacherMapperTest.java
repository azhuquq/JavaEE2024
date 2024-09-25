package com.azhuquq.mapper;

import com.azhuquq.pojo.Teacher;
import com.azhuquq.service.TeacherService;
import com.azhuquq.service.TeacherServiceImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TeacherMapperTest {
    TeacherService service = new TeacherServiceImpl();

    @Test
    public void test01() {
        Teacher teacher = new Teacher(0, "Teacher999", "123456", 1, 1);
        System.out.println(service.insertTeacher(teacher));
    }

    @Test
    public void test02() {
        Teacher teacher = new Teacher(7, "1818181", "181818", 1, 1);
        System.out.println(service.updateTeacher(teacher));
    }

    @Test
    public void test03() {
        Map<String, Object> map = new HashMap<>();
        map.put("tid", 7);
        map.put("tpassword", "12345678");
        System.out.println(service.updateTeacherPassword(map));
    }

    @Test
    public void test04() {
        System.out.println(service.deleteTeacherByTid(9));
    }
}
