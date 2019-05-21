package com.jiuge.songs.service;

import com.jiuge.songs.bean.RespEntity;

/**
 * 歌曲服务类
 * @Author: Cong
 * @Date: 2019/5/10 16:19
 */
public interface SongService {
    /**
     * 搜索歌曲，可通过歌名or歌手名or风格or语种搜索
     * @param pageNum
     * @param s_name
     * @param si_name
     * @param style
     * @param language
     * @return
     */
    RespEntity findSongs(int pageNum,String s_name,String si_name,String style,String language);

    /**
     * 根据歌曲ID搜索歌曲
     * @param song_ID
     * @return
     */
    RespEntity findSongById(int song_ID);

    /**
     * 根据歌曲ID精确找到歌曲文件
     * @param song_ID
     * @return
     */
    RespEntity findSongFile(int song_ID);

    /**
     * 增加指定歌曲播放量
     * @param song_ID
     * @return
     */
    RespEntity increasePlay(int song_ID);

    /**
     * 主页显示歌曲
     * @return
     */
    RespEntity indexSong();
}
