import com.azhuquq.pojo.Student;
import com.azhuquq.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        for (Student student : studentService.queryStuAll()) {
            System.out.println(student.toString());
        }
    }
}
