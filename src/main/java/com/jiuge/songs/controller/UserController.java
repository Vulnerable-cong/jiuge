package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.Impl.UserServiceImpl;
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

    /**
     * 登录
     * @param account
     * @param password
     * @return
     */
    @PostMapping("/login")
    public RespEntity login(@RequestParam("account") String account, @RequestParam("password") String password){
        return userServiceImpl.login(account,password);
    }

    /**
     * 注册
     * @param account
     * @param password
     * @return
     */
    @PostMapping("/register")
    public RespEntity register(@RequestParam("account") String account, @RequestParam("password") String password){
        return userServiceImpl.register(account,password);
    }

}
