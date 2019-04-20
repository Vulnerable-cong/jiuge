package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理Controller
 * @Author: Cong
 * @Date: 2019/4/18 21:00
 */

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/login")
    public RespEntity login(@RequestParam("account") String account, @RequestParam("password") String password){
        return userServiceImpl.login(account,password);
    }

    @PostMapping("/register")
    public RespEntity Register(@RequestParam("account") String account, @RequestParam("password") String password){
        return userServiceImpl.register(account,password);
    }

}
