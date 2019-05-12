package com.jiuge.songs.service;

import com.jiuge.songs.bean.RespEntity;

/**
 * 歌单服务类
 * @Author: Cong
 * @Date: 2019/5/12 16:46
 */
public interface SheetService {
    /**
     * 通过歌单id获取该歌单里的歌信息
     * @param sheet_ID
     * @return
     */
    RespEntity findSISById(int sheet_ID);

    /**
     * 搜索所有歌单
     * @param pageNum
     * @return
     */
    RespEntity findAllSheet(int pageNum);

    /**
     * 根据歌单名搜索歌单
     * @param sh_name
     * @param pageNum
     * @return
     */
    RespEntity findSheetsByName(String sh_name,int pageNum);

    /**
     * 根据语种标签搜索歌单
     * @param language
     * @param pageNum
     * @return
     */
    RespEntity findSheetsByLanguage(String language,int pageNum);

    /**
     * 根据风格标签搜索歌单
     * @param style
     * @param pageNum
     * @return
     */
    RespEntity findSheetsByStyle(String style,int pageNum);

    /**
     * 根据心情标签搜索歌单
     * @param mood
     * @param pageNum
     * @return
     */
    RespEntity findSheetsByMood(String mood,int pageNum);

    /**
     * 根据场景标签搜索歌单
     * @param scene
     * @param pageNum
     * @return
     */
    RespEntity findSheetByScene(String scene,int pageNum);

    /**
     * 新建歌单
     * @param sh_name
     * @param user_ID
     * @param language
     * @param style
     * @param mood
     * @param scene
     * @return
     */
    RespEntity newSheet(String sh_name,int user_ID,String language,String style,String mood,String scene);

    /**
     * 添加歌曲进歌单
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    RespEntity addSongToSheet(int sheet_ID,int song_ID);

    /**
     * 根据歌单id删除歌单
     * @param sheet_ID
     * @return
     */
    RespEntity deleteSheet(int sheet_ID);

    /**
     * 从歌单里删除歌曲
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    RespEntity deleteSongOfSheet(int sheet_ID,int song_ID);

    /**
     * 修改歌单信息
     * @param sh_name
     * @param language
     * @param style
     * @param mood
     * @param scene
     * @param sheet_ID
     * @return
     */
    RespEntity updateSheet(String sh_name,String language,String style,String mood,String scene,int sheet_ID);
}
