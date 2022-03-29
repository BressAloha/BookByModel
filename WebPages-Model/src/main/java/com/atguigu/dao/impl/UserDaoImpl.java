package com.atguigu.dao.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql="select id,username,password,'email' from t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public int savaUser(User user) {
        String sql="insert into t_user(username,password,email) values(?,?,?)";

        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public User queryUserByNameAndPassword(String username, String password) {
        String sql="select id,username,password,email from t_user where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }

//    public static void main(String[] args) {
//        UserDao userDao = new UserDaoImpl();
//        User user = new User(null,"admin","admin",null );
//        System.out.println(userDao.queryUserByNameAndPassword(user.getUsername(),user.getPassword()));
//    }
}
