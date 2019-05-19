package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.SingerService;
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
    SingerService singerService;

    /**
     * 所有歌手
     * @return
     */
    @GetMapping("/allsingers")
    public RespEntity findAllSingers(){
        return singerService.findAllSingers();
    }

    /**
     * 根据歌手名搜索歌手，支持模糊查询
     * @param si_name
     * @return
     */
    @GetMapping("/singers/name")
    public RespEntity findSingersBySingerName(@RequestParam("si_name") String si_name){
        return singerService.findSingersBySingerName(si_name);
    }

    /**
     * 根据性别分类查找歌手
     * @param gender
     * @return
     */
    @GetMapping("/singers/gender")
    public RespEntity findSingerByGender(@RequestParam("gender") String gender){
        return singerService.findSingersByGender(gender);

    }
}
