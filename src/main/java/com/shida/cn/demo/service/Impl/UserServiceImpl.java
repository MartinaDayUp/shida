package com.shida.cn.demo.service.Impl;

import com.shida.cn.demo.dao.UserDao;
import com.shida.cn.demo.entity.User;
import com.shida.cn.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteById(User user) {
        userDao.deleteById(user.getUserid());
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findUser(String username) {
        User user = userDao.findByName(username);
        return user;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
