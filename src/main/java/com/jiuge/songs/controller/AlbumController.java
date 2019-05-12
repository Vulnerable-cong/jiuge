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

    /**
     * 所有专辑
     * @return
     */
    @GetMapping("/allalbums")
    public RespEntity findAllAlbums(){
        return albumServiceImpl.findAllAlbums();
    }

    /**
     * 按专辑名搜索专辑，支持模糊查询
     * @param a_name
     * @return
     */
    @GetMapping("/albums/name")
    public RespEntity findAlbumsByAlbumName(String a_name){
        return albumServiceImpl.findAlbumsByAlbumName(a_name);
    }

}
