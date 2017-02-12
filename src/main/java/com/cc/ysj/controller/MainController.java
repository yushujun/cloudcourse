package com.cc.ysj.controller;

import com.cc.ysj.entity.User;
import com.cc.ysj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ysj on 2017/2/12.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        return userService.getAllUsernames();
    }

    @RequestMapping("")
    public String home(){
//        List<User> us = new ArrayList<User>();
//        User u = new User();
//        u.setUsername("Mark");
//        us.add(u);
//        u = new User();
//        u.setUsername("Fawofolo");
//        us.add(u);
//        userService.saveUsers(us);
        return "index";
    }
}