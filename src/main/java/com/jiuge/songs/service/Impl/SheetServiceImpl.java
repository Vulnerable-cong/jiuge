package com.jiuge.songs.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiuge.songs.bean.*;
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
@Service
public class SheetServiceImpl implements SheetService {

    @Autowired
    SheetMapper sheetMapper;

    /**
     * 条件查询
     * @param example
     * @return
     */
    private RespEntity find(int pageNum,SheetExample example){
        PageHelper.startPage(pageNum, 10);
        List<Sheet> sheets = sheetMapper.selectByExample(example);
        PageInfo<Sheet> songPageInfo = new PageInfo<>(sheets);
        return new RespEntity(RespCode.Success,songPageInfo);
    }

    /**
     * 根据歌单id查询出该歌单里的所有歌曲信息
     * @param sheet_ID
     * @return
     */
    @Override
    public RespEntity findSISById(int sheet_ID) {
        List<SongsInSheet> songs = sheetMapper.getSongsInSheet(sheet_ID);
        return new RespEntity(RespCode.Success,songs);
    }

    /**
     * 查询所有歌单
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findAllSheet(int pageNum) {
        SheetExample sheetExample = new SheetExample();
        return find(pageNum,sheetExample);
    }

    /**
     * 根据歌单名查询歌单
     * @param sh_name
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetsByName(String sh_name, int pageNum) {
        SheetExample sheetExample = new SheetExample();
        SheetExample.Criteria criteria = sheetExample.createCriteria();
        criteria.andSh_nameLike("%" + sh_name + "%");
        return find(pageNum,sheetExample);
    }

    /**
     * 根据语种标签查询歌单
     * @param language
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetsByLanguage(String language, int pageNum) {
        SheetExample sheetExample = new SheetExample();
        SheetExample.Criteria criteria = sheetExample.createCriteria();
        criteria.andLanguageEqualTo(language);
        return find(pageNum,sheetExample);
    }

    /**
     * 根据风格标签查询歌单
     * @param style
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetsByStyle(String style, int pageNum) {
        SheetExample sheetExample = new SheetExample();
        SheetExample.Criteria criteria = sheetExample.createCriteria();
        criteria.andStyleEqualTo(style);
        return find(pageNum,sheetExample);
    }

    /**
     * 根据心情标签查询歌单
     * @param mood
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetsByMood(String mood, int pageNum) {
        SheetExample sheetExample = new SheetExample();
        SheetExample.Criteria criteria = sheetExample.createCriteria();
        criteria.andMoodEqualTo(mood);
        return find(pageNum,sheetExample);
    }

    /**
     * 根据场景标签查询歌单
     * @param scene
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findSheetByScene(String scene, int pageNum) {
        SheetExample sheetExample = new SheetExample();
        SheetExample.Criteria criteria = sheetExample.createCriteria();
        criteria.andSceneEqualTo(scene);
        return find(pageNum,sheetExample);
    }

    /**
     * 新建歌单
     * @param sh_name
     * @param user_ID
     * @param language
     * @param style
     * @param mood
     * @param scene
     * @param sh_image
     * @return
     */
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public RespEntity newSheet(String sh_name, int user_ID, String language, String style, String mood, String scene, String sh_image) {
        //创建时把当前时间放入歌单表中，记为创建时间，只记到年月日
        Date date = new Date();
        Sheet sheet = new Sheet(sh_name,user_ID,date,language,style,mood,scene,sh_image);
        int i = sheetMapper.insertSelective(sheet);
        if (i == 1){
            return new RespEntity(RespCode.Success);
        }else {
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
        }else {
            return new RespEntity(RespCode.Fail);
        }
    }

    /**
     * 删除歌单
     * @param sheet_ID
     * @return
     */
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public RespEntity deleteSheet(int sheet_ID) {
        //先把关系表里相应的数据删除
        sheetMapper.deleteAllSongInSheet(sheet_ID);
        //再删除歌单表里相应的数据
        int i = sheetMapper.deleteByPrimaryKey(sheet_ID);
        if (i == 1 ){
            return new RespEntity(RespCode.Success);
        }else {
            return new RespEntity(RespCode.Fail);
        }
    }

    /**
     * 删除歌单里的某一首歌
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    @Override
    public RespEntity deleteSongOfSheet(int sheet_ID, int song_ID) {
        int i = sheetMapper.deleteSIS(sheet_ID,song_ID);
        if (i == 1 ){
            return new RespEntity(RespCode.Success);
        }else {
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
     * @param sh_image
     * @param sheet_ID
     * @return
     */
    @Override
    public RespEntity updateSheet(String sh_name, String language, String style, String mood, String scene, String sh_image, int sheet_ID) {
        Sheet sheet = new Sheet(sheet_ID,sh_name,language,style,mood,scene,sh_image);
        int i = sheetMapper.updateByPrimaryKeySelective(sheet);
        if (i == 1 ){
            return new RespEntity(RespCode.Success);
        }else {
            return new RespEntity(RespCode.Fail);
        }
    }

    /**
     * 修改歌单播放量
     * @param sheet_ID
     * @return
     */
    @Override
    public RespEntity increasePlay(int sheet_ID) {
        int play = sheetMapper.getSheetPlay(sheet_ID);
        play++;
        Sheet sheet = new Sheet();
        sheet.setSheet_ID(sheet_ID);
        sheet.setPlay(play);
        int i = sheetMapper.updateByPrimaryKeySelective(sheet);
        if (i == 1 ){
            return new RespEntity(RespCode.Success);
        }else {
            return new RespEntity(RespCode.Fail);
        }
    }
}
