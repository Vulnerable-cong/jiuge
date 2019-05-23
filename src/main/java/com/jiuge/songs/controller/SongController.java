package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    SongService songService;

    /**
     * 所有歌曲，支持分页查询
     * @param pageNum
     * @return
     */
    @GetMapping("/songs")
    public RespEntity findAllSongs(@RequestParam(defaultValue = "1") int pageNum){
        return songService.findSongs(pageNum,null,null,null,null);
    }

    /**
     * 根据歌曲名搜索歌曲，支持模糊查询、分页
     * @param pageNum
     * @param s_name
     * @return
     */
    @GetMapping(value = "/songs",params = "s_name")
    public RespEntity findSongsBySongName(@RequestParam(defaultValue = "1") int pageNum,@RequestParam("s_name") String s_name){
        return songService.findSongs(pageNum,s_name,null,null,null);
    }

    /**
     * 根据歌手名搜索歌曲，支持模糊查询、分页
     * @param pageNum
     * @param si_name
     * @return
     */
    @GetMapping(value = "/songs",params = "si_name")
    public RespEntity findSongsBySingerName(@RequestParam(defaultValue = "1") int pageNum,@RequestParam("si_name") String si_name){
        return songService.findSongs(pageNum,null,si_name,null,null);
    }

    /**
     * 根据歌曲id精准找到歌曲
     * @param song_ID
     * @return
     */
    @GetMapping("/song")
    public RespEntity findSongById(@RequestParam("song_ID") int song_ID){
        return songService.findSongById(song_ID);
    }

    /**
     * 根据风格分类查找歌曲，支持分页
     * @param pageNum
     * @param style
     * @return
     */
    @GetMapping(value = "/songs",params = "style")
    public RespEntity findSongsByStyle(@RequestParam(defaultValue = "1") int pageNum,@RequestParam("style") String style){
        return songService.findSongs(pageNum,null,null,style,null);
    }

    /**
     * 根据语种分类查找歌曲，支持分页
     * @param pageNum
     * @param language
     * @return
     */
    @GetMapping(value = "/songs",params = "language")
    public RespEntity findSongsByLanguage(@RequestParam(defaultValue = "1") int pageNum,@RequestParam("language") String language){
        return songService.findSongs(pageNum,null,null,null,language);
    }

    /**
     * 根据歌曲ID拿到歌曲的文件名（播放）
     * @param song_ID
     * @return
     */
    @GetMapping("/song/file")
    public RespEntity findSongFile(@RequestParam("song_ID") int song_ID){
        return songService.findSongFile(song_ID);
    }


    /**
     * 拿到主页需要的歌
     * @return
     */
    @GetMapping("/indexsongs")
    public RespEntity indexSongs(){
        return songService.indexSong();
    }

    /**
     * 增加歌曲播放量
     * 每次加一
     * 本质是修改数据库的数据，故使用put请求
     * @param song_ID
     * @return
     */
    @PostMapping("/song/increase")
    public RespEntity increasePlay(@RequestParam("song_ID") int song_ID){
        return songService.increasePlay(song_ID);
    }


}
