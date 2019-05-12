package com.jiuge.songs.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.bean.Sheet;
import com.jiuge.songs.bean.SongsInSheet;
import com.jiuge.songs.mapper.SheetMapper;
import com.jiuge.songs.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 歌单服务的实现类
 * @Author: Cong
 * @Date: 2019/5/12 16:48
 */
@Service("SheetService")
public class SheetServiceImpl implements SheetService {

    @Autowired
    SheetMapper sheetMapper;

    /**
     * 根据歌单id查询出该歌单里的所有歌曲信息
     * @param sheet_ID
     * @return
     */
    @Override
    public RespEntity findSISById(int sheet_ID) {
        List<SongsInSheet> sis = sheetMapper.getSheetSongsById(sheet_ID);
        return new RespEntity(RespCode.Success,sis);
    }

    /**
     * 搜索所有歌单 功能，支持分页查询
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findAllSheet(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Sheet> sheets = sheetMapper.getAllSheet();
        PageInfo<Sheet> spi = new PageInfo<Sheet>(sheets);
        return new RespEntity(RespCode.Success,spi);
    }

    /**
     * 根据歌单名搜索歌单，支持分页查询和模糊查询
     * @param sh_name
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetsByName(String sh_name, int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Sheet> sheets = sheetMapper.getSheetByName(sh_name);
        PageInfo<Sheet> spi = new PageInfo<Sheet>(sheets);
        return new RespEntity(RespCode.Success,spi);
    }

    /**
     * 根据语种标签搜索歌单，支持分页查询
     * @param language
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetsByLanguage(String language, int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Sheet> sheets = sheetMapper.getSheetByLanguage(language);
        PageInfo<Sheet> spi = new PageInfo<Sheet>(sheets);
        return new RespEntity(RespCode.Success,spi);
    }

    /**
     * 根据风格标签搜索歌单，支持分页查询
     * @param style
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetsByStyle(String style, int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Sheet> sheets = sheetMapper.getSheetByStyle(style);
        PageInfo<Sheet> spi = new PageInfo<Sheet>(sheets);
        return new RespEntity(RespCode.Success,spi);
    }

    /**
     * 根据心情标签搜索歌单，支持分页查询
     * @param mood
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetsByMood(String mood, int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Sheet> sheets = sheetMapper.getSheetByMood(mood);
        PageInfo<Sheet> spi = new PageInfo<Sheet>(sheets);
        return new RespEntity(RespCode.Success,spi);
    }

    /**
     * 根据场景标签搜索歌单，支持分页查询
     * @param scene
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetByScene(String scene, int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Sheet> sheets = sheetMapper.getSheetByScene(scene);
        PageInfo<Sheet> spi = new PageInfo<Sheet>(sheets);
        return new RespEntity(RespCode.Success,spi);
    }

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
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public RespEntity newSheet(String sh_name, int user_ID, String language, String style, String mood, String scene) {
        //新建时把当前时间放入歌单表中，记为创建时间，只记到年月日
        Date date = new Date();

        Sheet sheet = new Sheet(sh_name,user_ID,0,date,language,style,mood,scene);
        int i = sheetMapper.insertSheet(sheet);
        if (i == 1){
        return new RespEntity(RespCode.Success);}
        else{
            return new RespEntity(RespCode.Fail);
        }

    }

    /**
     * 添加歌曲进歌单
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public RespEntity addSongToSheet(int sheet_ID, int song_ID) {
        int i = sheetMapper.insertSongsToSheet(sheet_ID,song_ID);
        if (i == 1){
            return new RespEntity(RespCode.Success);
        }else{
            return new RespEntity(RespCode.Fail);
        }

    }

    /**
     * 删除歌单
     * @param sheet_ID
     * @return
     */
    @Override
    public RespEntity deleteSheet(int sheet_ID) {
        int i = sheetMapper.deleteSheetById(sheet_ID);
        if (i ==1){
            return new RespEntity(RespCode.Success);
        }else{
            return new RespEntity(RespCode.Fail);
        }
    }

    /**
     * 从歌单里删除歌曲
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    @Override
    public RespEntity deleteSongOfSheet(int sheet_ID, int song_ID) {
        int i = sheetMapper.deleteSongOfSheet(sheet_ID,song_ID);
        if (i ==1){
            return new RespEntity(RespCode.Success);
        }else{
            return new RespEntity(RespCode.Fail);
        }
    }

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
    @Override
    public RespEntity updateSheet(String sh_name, String language, String style, String mood, String scene, int sheet_ID) {
        int i = sheetMapper.updateSheetById(sh_name,language,style,mood,scene,sheet_ID);
        if (i ==1){
            return new RespEntity(RespCode.Success);
        }else{
            return new RespEntity(RespCode.Fail);
        }
    }


}
