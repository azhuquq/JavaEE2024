package com.azhuquq.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.io.IOException;

public class SpringMVCController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 这里需要调用业务逻辑，访问数据库，然后得到处理结果，比如找到了，或是没找到
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hello Spring MVC");
        mv.setViewName("error");
        return mv;
    }
}
