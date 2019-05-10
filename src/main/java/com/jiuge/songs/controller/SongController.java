package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.Impl.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 歌曲Controller
 * @Author: Cong
 * @Date: 2019/5/9 23:21
 */
@RestController
public class SongController {

    @Autowired
    SongServiceImpl songServiceImpl;

    @GetMapping("/allSongs")
    public RespEntity findAllSongs(){
        return songServiceImpl.findAllSongs();
    }

    @GetMapping("/findsongsbyname")
    public RespEntity findSongsBySongName(@RequestParam("s_name") String s_name){
        return songServiceImpl.findSongsBySongName(s_name);
    }

    @GetMapping("/findsongsbysinger")
    public RespEntity findSongsBySingerName(@RequestParam("si_name") String si_name){
        return songServiceImpl.findSongsBySingerName(si_name);
    }

    @GetMapping("/findsongsbystyle")
    public RespEntity findSongsByStyle(@RequestParam("style") String style){
        return songServiceImpl.findSongsByStyle(style);
    }

    @GetMapping("/findsongsbylanguage")
    public RespEntity findSongsByLanguage(@RequestParam("language") String language){
        return songServiceImpl.findSongsByLanguage(language);
    }


}
