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
    RespEntity findAllSongs(int pageNum);

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
