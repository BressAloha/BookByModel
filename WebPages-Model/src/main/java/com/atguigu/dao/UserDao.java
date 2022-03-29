package com.atguigu.dao;

import com.atguigu.pojo.User;

public interface UserDao {
    public User queryUserByUsername(String username);
    public int savaUser(User user);
    public User queryUserByNameAndPassword(String username,String password);


}
