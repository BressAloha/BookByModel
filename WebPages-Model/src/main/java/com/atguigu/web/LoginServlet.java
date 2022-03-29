package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.imp.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {


    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(username);
        User user = userService.login(new User(null,username,password,null));/*接受登录验证结果*/
        if (user==null) {
            System.out.println("账号或者密码错误");
            req.getRequestDispatcher("/pages/login.html").forward(req, resp);
        } else {
            req.getRequestDispatcher("/pages/login_success.html").forward(req,resp);/*跳转登录成功页面*/
            System.out.println(user);

        }


    }
}
