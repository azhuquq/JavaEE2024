package com.azhuquq.servlet;

import com.azhuquq.service.StudentService;
import com.azhuquq.service.StudentServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sname = req.getParameter("sname");
        String spassword = req.getParameter("spassword");
        System.out.println("11111111111111111");
        System.out.println(sname += "," + spassword);
        StudentService studentService = new StudentServiceImpl();
        boolean login = studentService.login(sname, spassword);
        if (login) {
            resp.sendRedirect("/ok.jsp");
        } else resp.sendRedirect("/error.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
