package com.it.springboot.controller;

import com.it.springboot.entry.User;
import com.it.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

//freemarker模板
@Controller
@RequestMapping("/user")
public class UserController2 {

    @Resource
    UserService userService;

    @RequestMapping("queryAllUsers")
    public String queryAllUsers(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "user";
    }

    @RequestMapping("queryAllUsers2")
    public String queryAllUsers2(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "user/queryAllUser";
    }


}
