package com.atguigu.web;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowServlet extends HttpServlet {
    private UserDao userDao = new UserDaoImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("name");


        User user = userDao.queryUserByUsername(username);
        System.out.println("yes");
        System.out.println(username);

        req.getSession().setAttribute(user.getUsername(),user);

        req.getRequestDispatcher("/pages/include/showInfor.jsp").forward(req,resp);


    }
}
