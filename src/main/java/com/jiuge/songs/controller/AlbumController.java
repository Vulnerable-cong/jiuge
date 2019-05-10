package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.Impl.AlbumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 专辑Controller
 * @Author: Cong
 * @Date: 2019/5/10 19:11
 */
@RestController
public class AlbumController {

    @Autowired
    AlbumServiceImpl albumServiceImpl;

    @GetMapping("/allalbums")
    public RespEntity findAllAlbums(){
        return albumServiceImpl.findAllAlbums();
    }

    @GetMapping("/findalbumsbyname")
    public RespEntity findAlbumsByAlbumName(String a_name){
        return albumServiceImpl.findAlbumsByAlbumName(a_name);
    }

}
