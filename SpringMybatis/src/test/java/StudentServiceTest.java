import com.azhuquq.pojo.Student;
import com.azhuquq.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceTest {

    private StudentService studentService;

    @Before
    public void setUp() throws Exception {
        // 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        studentService = (StudentService) context.getBean("studentService");
    }

    @Test
    public void testQueryStuAll() {
        List<Student> students = studentService.queryStuAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testInsertStudent() {
        Student student = new Student("s07", "test111", "pwd111", 1, 1);
        int result = studentService.insertStudent(student);
        System.out.println(result);
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student("s06", "test222", "pwd222", 2, 0);
        int result = studentService.updateStudent(student);
        System.out.println(result);
    }

    @Test
    public void testDeleteStudent() {
        int result = studentService.deleteStudent("s05");
        System.out.println(result);
    }
}
