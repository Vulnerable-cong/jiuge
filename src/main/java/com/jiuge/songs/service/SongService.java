package com.jiuge.songs.service;

import com.jiuge.songs.bean.RespEntity;

/**
 * 歌曲服务类
 * @Author: Cong
 * @Date: 2019/5/10 16:19
 */
public interface SongService {
    /**
     * 搜索所有歌曲
     * @return
     */
    RespEntity findAllSongs();

    /**
     * 根据歌曲名搜索歌曲
     * @param s_name
     * @return
     */
    RespEntity findSongsBySongName(String s_name);

    /**
     * 根据歌手名搜索歌曲
     * @param si_name
     * @return
     */
    RespEntity findSongsBySingerName(String si_name);

    /**
     * 根据风格搜索歌曲
     * @param style
     * @return
     */
    RespEntity findSongsByStyle(String style);

    /**
     * 根据语种搜索歌曲
     * @param language
     * @return
     */
    RespEntity findSongsByLanguage(String language);
}
