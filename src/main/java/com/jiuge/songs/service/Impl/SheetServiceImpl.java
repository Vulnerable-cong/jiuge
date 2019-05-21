package com.jiuge.songs.service.Impl;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.SheetService;
import org.springframework.stereotype.Service;

/**
 * 歌单服务的实现类
 * @Author: Cong
 * @Date: 2019/5/12 16:48
 */
@Service
public class SheetServiceImpl implements SheetService {


    @Override
    public RespEntity findSISById(int sheet_ID) {
        return null;
    }

    @Override
    public RespEntity findAllSheet(int pageNum) {
        return null;
    }

    @Override
    public RespEntity findSheetsByName(String sh_name, int pageNum) {
        return null;
    }

    @Override
    public RespEntity findSheetsByLanguage(String language, int pageNum) {
        return null;
    }

    @Override
    public RespEntity findSheetsByStyle(String style, int pageNum) {
        return null;
    }

    @Override
    public RespEntity findSheetsByMood(String mood, int pageNum) {
        return null;
    }

    @Override
    public RespEntity findSheetByScene(String scene, int pageNum) {
        return null;
    }

    @Override
    public RespEntity newSheet(String sh_name, int user_ID, String language, String style, String mood, String scene, String sh_image) {
        return null;
    }

    @Override
    public RespEntity addSongToSheet(int sheet_ID, int song_ID) {
        return null;
    }

    @Override
    public RespEntity deleteSheet(int sheet_ID) {
        return null;
    }

    @Override
    public RespEntity deleteSongOfSheet(int sheet_ID, int song_ID) {
        return null;
    }

    @Override
    public RespEntity updateSheet(String sh_name, String language, String style, String mood, String scene, String sh_image, int sheet_ID) {
        return null;
    }

    @Override
    public RespEntity increasePlay(int sheet_ID) {
        return null;
    }
}
