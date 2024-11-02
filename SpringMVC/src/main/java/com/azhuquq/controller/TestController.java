package com.azhuquq.controller;

import com.azhuquq.pojo.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/stu")
public class TestController {
    @RequestMapping("/test01")
    public String test01() {
        System.out.println("test111111111");
        return "error";
    }

    @RequestMapping("/test02")
    public String test02() {
        System.out.println("test222222222");
        return "error";
    }

    // =============下面是页面参数传递到处理器的示例=============
    // 第一种获取页面参数值的方法：通过在方法中添加HttpServletRequest形参
    // 再通过getParameter()方法获取页面传递过来的值
//    @RequestMapping("/test03")
//    public String test03(HttpServletRequest request) {
//        System.out.println(request.getParameter("sname"));
//        System.out.println(request.getParameter("sright"));
//        System.out.println("test333333333");
//        return "error";
//    }

    // 第二种获取页面参数值的方法：在方法中直接添加对页面参数对应的形参
    // 这种方法在Spring6.1以下的版本可用
//    @RequestMapping("/test03")
//    public String test03(String sid, String sname, String spassword, String sright, String sflag) {
//        System.out.println(sname);
//        System.out.println(sright);
//        System.out.println("test333333333");
//        return "error";
//    }

    // 第三种获取页面参数值的方法：通过使用@RequestParam("sid")注解标注一下形参
    // 注意：里面的sid要与页面的name值对应
//    @RequestMapping("/test03")
//    public String test03(@RequestParam("sid") String sid,
//                         @RequestParam("sname") String sname,
//                         @RequestParam("spassword") String spassword,
//                         @RequestParam("sname") String sright,
//                         @RequestParam("sflag") String sflag) {
//        System.out.println(sname);
//        System.out.println(spassword);
//        System.out.println(sflag);
//        System.out.println("test333333333");
//        return "error";
//    }
//
    // 第四种获取页面参数值的方法，直接类作为形参，要求属性名与页面参数名要一致
//    @RequestMapping("/test03")
//    public String test03(Student student) {
//        System.out.println(student.toString());
//        System.out.println("test333333333");
//        return "error";
//    }

    // =============下面是将处理器的值写回页面的示例=============
    // 这里的返回值从业务逻辑拿到的，我们只是模拟，实际需要调用MyBatis部分
    // 第一种往页面传递参数值的方法：返回值设置为ModelAndView对象，是可以进行寻址的
    // ModelAndView对象需要程序员自己创建
//    @RequestMapping("/test03")
//    public ModelAndView test03() {
//        System.out.println("test333333333");
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("msg", "zhangsan");
//        mv.setViewName("error");
//        return mv;
//    }

    // 第二种往页面传递参数值的方法：通过Session对象来传值
//    @RequestMapping("/test03")
//    public String test03(HttpServletRequest request) {
//        System.out.println("test333333333");
//        HttpSession session = request.getSession();
//        session.setAttribute("msg", "lisi");
//        return "error";
//    }

    // 第三种往页面传递参数值的方法：通过Model对象来传值，这个对象只传值，不寻址
    // Model对象由框架提供，不需要程序员手动创建
//    @RequestMapping("/test03")
//    public String test03(Model model) {
//        System.out.println("test333333333");
//        model.addAttribute("msg","wangwu");
//        return "error";
//    }

    // =============下面是页面跳转的示例=============
    // 第一种页面跳转的方法：跳进WEB-INF目录
//    @RequestMapping("/test03")
//    public String test03(Model model) {
//        System.out.println("test333333333");
//        return "error";
//    }

    // 第二种页面跳转的方法：跳出WEB-INF目录
//    @RequestMapping("/test03")
//    public String test03(Model model) {
//        System.out.println("test333333333");
//        return "redirect:/ok.jsp";
//    }

    // 第三种页面跳转的方法：从一个请求跳转到另一个请求
    @RequestMapping("/test03")
    public String test03(Model model) {
        System.out.println("test333333333");
        return "redirect:/stu/test01";
    }
}
