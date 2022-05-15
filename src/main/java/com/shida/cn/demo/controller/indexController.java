package com.shida.cn.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.shida.cn.demo.entity.User;
import com.shida.cn.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/ajaxUser")
    @ResponseBody
    public JSONObject getAjax(@RequestParam String username){
        JSONObject jsonObject = new JSONObject();
        User user= userService.findUser(username);
        if(user!=null){
            jsonObject.put("userExit",true);
        }else {
            jsonObject.put("userExit",false);
        }
        return jsonObject;
    }
}
