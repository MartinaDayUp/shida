package com.shida.cn.demo.controller;

import com.shida.cn.demo.entity.User;
import com.shida.cn.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 123
 */
@Controller
public class indexController {
    @Autowired
    UserService userService;

    @RequestMapping("/userRegister")
    public String getIndex(User user){
        userService.addUser(user);

        return "login.jsp";
    }
}
