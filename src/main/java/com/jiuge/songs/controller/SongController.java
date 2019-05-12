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

    /**
     * 所有歌曲，支持分页查询
     * @param pageNum
     * @return
     */
    @GetMapping("/allSongs")
    public RespEntity findAllSongs(@RequestParam(defaultValue = "1") int pageNum){
        return songServiceImpl.findAllSongs(pageNum);
    }

    /**
     * 根据歌曲名搜索歌曲，支持模糊查询
     * @param s_name
     * @return
     */
    @GetMapping("/songs/name")
    public RespEntity findSongsBySongName(@RequestParam("s_name") String s_name){
        return songServiceImpl.findSongsBySongName(s_name);
    }

    /**
     * 根据歌手名搜索歌曲，支持模糊查询
     * @param si_name
     * @return
     */
    @GetMapping("/songs/singer")
    public RespEntity findSongsBySingerName(@RequestParam("si_name") String si_name){
        return songServiceImpl.findSongsBySingerName(si_name);
    }

    /**
     * 根据歌曲id精准找到歌曲
     * @param song_ID
     * @return
     */
    @GetMapping("/song/id")
    public RespEntity findSongById(@RequestParam("song_ID") int song_ID){
        return songServiceImpl.findSongById(song_ID);
    }

    /**
     * 根据风格分类查找歌曲
     * @param style
     * @return
     */
    @GetMapping("/songs/style")
    public RespEntity findSongsByStyle(@RequestParam("style") String style){
        return songServiceImpl.findSongsByStyle(style);
    }

    /**
     * 根据语种分类查找歌曲
     * @param language
     * @return
     */
    @GetMapping("/songs/language")
    public RespEntity findSongsByLanguage(@RequestParam("language") String language){
        return songServiceImpl.findSongsByLanguage(language);
    }


}
