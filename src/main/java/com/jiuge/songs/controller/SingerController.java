package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.Impl.SingerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 歌手Controller
 * @Author: Cong
 * @Date: 2019/5/10 17:17
 */
@RestController
public class SingerController {

    @Autowired
    SingerServiceImpl singerServiceImpl;

    @GetMapping("/allSingers")
    public RespEntity findAllSingers(){
        return singerServiceImpl.findAllSingers();
    }

    @GetMapping("/findsingersbyname")
    public RespEntity findSingersBySingerName(@RequestParam("si_name") String si_name){
        return singerServiceImpl.findSingersBySingerName(si_name);
    }

    @GetMapping("/findsingersbygender")
    public RespEntity findSingerByGender(@RequestParam("gender") String gender){
        return singerServiceImpl.findSingersByGender(gender);

    }
}
