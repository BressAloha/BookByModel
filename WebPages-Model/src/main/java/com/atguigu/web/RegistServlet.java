package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.imp.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {

    private UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("name");
        String password=req.getParameter("password");
        String email=req.getParameter("email");
        System.out.println("用户名已存在");

        if(userService.existUsername(username)){
            System.out.println("用户名已存在");
            req.getRequestDispatcher("/pages/regist.html").forward(req,resp);
        } else
        {
            userService.registUser(new User(null,username,password,email));
            req.getRequestDispatcher("/pages/regist_success.html").forward(req,resp);
        }

    }



}
