package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 歌单Controller
 * @Author: Cong
 * @Date: 2019/5/12 16:53
 */
@RestController
public class SheetController {

    @Autowired
    SheetService sheetService;

    /**
     * 根据歌单id找到对应歌单里的歌曲的信息
     * @param sheet_ID
     * @return
     */
    @GetMapping("/sheet/songs")
    public RespEntity findSheetSongsById(@RequestParam("sheet_ID") int sheet_ID){
        return sheetService.findSISById(sheet_ID);
    }

    /**
     * 所有歌单
     * @param pageNum
     * @param order
     * @return
     */
    @GetMapping("/sheets")
    public RespEntity findAllSheet(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,@RequestParam("order") String order){
        return sheetService.findAllSheet(pageNum,order);
    }

    /**
     * 按歌单名搜索歌单，支持模糊查询，分页查询
     * @param sh_name
     * @param pageNum
     * @param order
     * @return
     */
    @GetMapping(value = "/sheets",params ="sh_name" )
    public RespEntity findSheetsByName(@RequestParam("sh_name")String sh_name,@RequestParam(defaultValue = "1") int pageNum,@RequestParam("order") String order){
        return sheetService.findSheetsByName(sh_name,pageNum,order);
    }

    /**
     * 按语种标签分类查找歌单
     * @param language
     * @param pageNum
     * @param order
     * @return
     */
    @GetMapping(value = "/sheets",params = "language")
    public RespEntity findSheetsByLanguage(@RequestParam("language")String language,@RequestParam(defaultValue = "1") int pageNum,@RequestParam("order") String order){
        return sheetService.findSheetsByLanguage(language,pageNum,order);
    }

    /**
     * 按风格标签分类查找歌单
     * @param style
     * @param pageNum
     * @param order
     * @return
     */
    @GetMapping(value = "/sheets",params = "style")
    public RespEntity findSheetsByStyle(@RequestParam("style")String style,@RequestParam(defaultValue = "1") int pageNum,@RequestParam("order") String order){
        return sheetService.findSheetsByStyle(style,pageNum,order);
    }

    /**
     * 按心情标签分类查找歌单
     * @param mood
     * @param pageNum
     * @param order
     * @return
     */
    @GetMapping(value = "/sheets",params = "mood")
    public RespEntity findSheetsByMood(@RequestParam("mood")String mood,@RequestParam(defaultValue = "1") int pageNum,@RequestParam("order") String order){
        return sheetService.findSheetsByMood(mood,pageNum,order);
    }

    /**
     * 按场景标签分类查找歌单
     * @param scene
     * @param pageNum
     * @param order
     * @return
     */
    @GetMapping(value = "/sheets",params = "scene")
    public RespEntity findSheetsByScene(@RequestParam("scene")String scene,@RequestParam(defaultValue = "1") int pageNum,@RequestParam("order") String order){
        return sheetService.findSheetByScene(scene,pageNum,order);
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
    @PostMapping("/sheet/new")
    public RespEntity newSheet(@RequestParam("sh_name") String sh_name,@RequestParam("user_ID") int user_ID,
                               @RequestParam("language") String language,@RequestParam("style") String style,
                               @RequestParam("language") String mood,@RequestParam("language") String scene,
                               @RequestParam("sh_image") String sh_image){

        return sheetService.newSheet(sh_name,user_ID,language,style,mood,scene,sh_image);
    }

    /**
     * 添加歌曲进歌单
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    @PostMapping("/sheet/addsong")
    public RespEntity addSongToSheet(@RequestParam("sheet_ID")int sheet_ID, @RequestParam("song_ID")int song_ID){
        return sheetService.addSongToSheet(sheet_ID,song_ID);
    }

    /**
     * 增加歌单播放量
     * 每次加一
     * @param sheet_ID
     * @return
     */
    @PostMapping("/sheet/increase")
    public RespEntity increasePlay(@RequestParam("sheet_ID") int sheet_ID){
        return sheetService.increasePlay(sheet_ID);
    }

    /**
     * 根据歌单ID删除歌单
     * @param sheet_ID
     * @return
     */
    @DeleteMapping("/sheet/delete")
    public RespEntity deleteSheet(@RequestParam("sheet_ID") int sheet_ID){
        return sheetService.deleteSheet(sheet_ID);
    }

    /**
     * 删除歌单里的某一首歌
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    @DeleteMapping("/sheet/song/delete")
    public RespEntity deleteSIS(@RequestParam("sheet_ID") int sheet_ID,@RequestParam("song_ID") int song_ID){
        return sheetService.deleteSongOfSheet(sheet_ID,song_ID);
    }

}
