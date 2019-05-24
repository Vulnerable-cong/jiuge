package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/singers")
    public RespEntity findAllSingers(@RequestParam(defaultValue = "1") int pageNum){
        return singerService.findAllSingers(pageNum);
    }

    /**
     * 根据歌手名搜索歌手，支持模糊查询
     * @param si_name
     * @return
     */
    @GetMapping(value = "/singers",params = "si_name")
    public RespEntity findSingersBySingerName(@RequestParam(defaultValue = "1") int pageNum,@RequestParam("si_name") String si_name){
        return singerService.findSingersBySiN(pageNum,si_name);
    }

    /**
     * 根据三种条件查找歌手
     * @param pageNum
     * @param gender
     * @param area
     * @param label
     * @return
     */
    @GetMapping("/singers/gender={gender}&area={area}&label={label}")
    public RespEntity findSingerByExample(@RequestParam(defaultValue = "1") int pageNum, @PathVariable String gender, @PathVariable String area, @PathVariable String label){
        return singerService.findSingersByExample(pageNum,gender,area,label);

    }
}
