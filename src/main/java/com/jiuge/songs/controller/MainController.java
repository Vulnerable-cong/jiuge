package com.jiuge.songs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 主页的Controller
 * @Author: Cong
 * @Date: 2019/4/18 20:13
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String root(){
        return "html/index.html";
    }

    @GetMapping("/index")
    public String index(){
        return "html/index.html";
    }
}

