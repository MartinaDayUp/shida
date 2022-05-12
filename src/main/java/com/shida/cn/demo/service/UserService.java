package com.shida.cn.demo.service;

import com.shida.cn.demo.entity.User;

import java.util.List;

public interface UserService {
    //1.增加用户的业务
    void addUser(User user);
    //2.删除用户的业务
    void deleteById(User user);
    //3.更新用户信息
    void update(User user);
    //4.查找用户的方法
    User findUser(String username);
    //5.查找所有用户
    List<User> findAll();
}
