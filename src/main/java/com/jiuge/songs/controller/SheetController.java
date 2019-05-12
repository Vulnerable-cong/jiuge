package com.jiuge.songs.controller;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.Impl.SheetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 歌单Controller
 * @Author: Cong
 * @Date: 2019/5/12 16:53
 */
@RestController
public class SheetController {

    @Autowired
    SheetServiceImpl sheetServiceImpl;

    /**
     * 根据歌单id找到对应歌单里的歌曲的信息
     * @param sheet_ID
     * @return
     */
    @GetMapping("/sheet/songs")
    public RespEntity findSheetSongsById(@RequestParam("sheet_ID") int sheet_ID){
        return sheetServiceImpl.findSISById(sheet_ID);
    }

    /**
     * 所有歌单
     * @param pageNum
     * @return
     */
    @GetMapping("/allsheets")
    public RespEntity findAllSheet(@RequestParam(defaultValue = "1") int pageNum){
        return sheetServiceImpl.findAllSheet(pageNum);
    }

    /**
     * 按歌单名搜索歌单，支持模糊查询，分页查询
     * @param sh_name
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/name")
    public RespEntity findSheetsByName(String sh_name,@RequestParam(defaultValue = "1") int pageNum){
        return sheetServiceImpl.findSheetsByName(sh_name,pageNum);
    }

    /**
     * 按语种标签分类查找歌单
     * @param language
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/language")
    public RespEntity findSheetsByLanguage(String language,@RequestParam(defaultValue = "1") int pageNum){
        return sheetServiceImpl.findSheetsByLanguage(language,pageNum);
    }

    /**
     * 按风格标签分类查找歌单
     * @param style
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/style")
    public RespEntity findSheetsByStyle(String style,@RequestParam(defaultValue = "1") int pageNum){
        return sheetServiceImpl.findSheetsByStyle(style,pageNum);
    }

    /**
     * 按心情标签分类查找歌单
     * @param mood
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/mood")
    public RespEntity findSheetsByMood(String mood,@RequestParam(defaultValue = "1") int pageNum){
        return sheetServiceImpl.findSheetsByMood(mood,pageNum);
    }

    /**
     * 按场景标签分类查找歌单
     * @param scene
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/scene")
    public RespEntity findSheetsByScene(String scene,@RequestParam(defaultValue = "1") int pageNum){
        return sheetServiceImpl.findSheetByScene(scene,pageNum);
    }

    /**
     * 新建歌单
     * @return
     */
    @PostMapping("/sheet")
    public RespEntity newSheet(@RequestParam("sh_name") String sh_name,@RequestParam("user_ID") int user_ID,
                               @RequestParam("language") String language,@RequestParam("style") String style,
                               @RequestParam("language") String mood,@RequestParam("language") String scene){

        return sheetServiceImpl.newSheet(sh_name,user_ID,language,style,mood,scene);
    }
}
