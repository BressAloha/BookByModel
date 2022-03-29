package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.imp.UserServiceImpl;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    UserService userService = new UserServiceImpl();


    @Test
    void registUser() {
        userService.registUser(new User(null,"UserServicetest","10086","455@163.com" ));
        userService.registUser(new User(null,"UserServicetest2","10086","455@163.com" ));

    }

    @Test
    void login() {
        System.out.println(userService.login(new User(null,"UserServicetest2","10086","455@163.com" )));
    }

    @Test
    void existUsername() {
        System.out.println(userService.existUsername("admin"));
    }

}