package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    User user = new User(null,"wx","10086","18886@163.com");
    @Test
    void queryUserByUsername() {

        if(userDao.queryUserByUsername("admin")!=null){
            System.out.println("用户名已存在");

        }
        else{
            System.out.println("用户名可用");
        }


    }

    @Test
    void savaUser() {
        System.out.println(userDao.savaUser(user));
    }

    @Test
    void queryUserByNameAndPassword() {
        if(userDao.queryUserByNameAndPassword("admin","admin")!=null){
            System.out.println("登录成功");

        }
        else{
            System.out.println("登录失败！！用户名或者密码错误");
        }
    }
}