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
     * @return
     */
    @GetMapping("/allsheets")
    public RespEntity findAllSheet(@RequestParam(defaultValue = "1") int pageNum){
        return sheetService.findAllSheet(pageNum);
    }

    /**
     * 按歌单名搜索歌单，支持模糊查询，分页查询
     * @param sh_name
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/name")
    public RespEntity findSheetsByName(@RequestParam("sh_name")String sh_name,@RequestParam(defaultValue = "1") int pageNum){
        return sheetService.findSheetsByName(sh_name,pageNum);
    }

    /**
     * 按语种标签分类查找歌单
     * @param language
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/language")
    public RespEntity findSheetsByLanguage(@RequestParam("language")String language,@RequestParam(defaultValue = "1") int pageNum){
        return sheetService.findSheetsByLanguage(language,pageNum);
    }

    /**
     * 按风格标签分类查找歌单
     * @param style
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/style")
    public RespEntity findSheetsByStyle(@RequestParam("style")String style,@RequestParam(defaultValue = "1") int pageNum){
        return sheetService.findSheetsByStyle(style,pageNum);
    }

    /**
     * 按心情标签分类查找歌单
     * @param mood
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/mood")
    public RespEntity findSheetsByMood(@RequestParam("mood")String mood,@RequestParam(defaultValue = "1") int pageNum){
        return sheetService.findSheetsByMood(mood,pageNum);
    }

    /**
     * 按场景标签分类查找歌单
     * @param scene
     * @param pageNum
     * @return
     */
    @GetMapping("/sheets/scene")
    public RespEntity findSheetsByScene(@RequestParam("scene")String scene,@RequestParam(defaultValue = "1") int pageNum){
        return sheetService.findSheetByScene(scene,pageNum);
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
    @PostMapping("/sheet")
    public RespEntity newSheet(@RequestParam("sh_name") String sh_name,@RequestParam("user_ID") int user_ID,
                               @RequestParam("language") String language,@RequestParam("style") String style,
                               @RequestParam("language") String mood,@RequestParam("language") String scene,
                               @RequestParam("sh_image") String sh_image){

        return sheetService.newSheet(sh_name,user_ID,language,style,mood,scene,sh_image);
    }

//    @GetMapping("/sheet/play")
//    public RespEntity playInSheet(@RequestParam("sheet_ID") int sheet_ID,@RequestParam("song_ID") int song_ID){
//        return sheetServiceImpl.playInSheet(sheet_ID,song_ID);
//    }


    /**
     * 增加歌单播放量
     * 每次加一
     * 本质是修改数据库的数据，故使用put请求
     * @param sheet_ID
     * @return
     */
    @PutMapping("/sheet/increase")
    public RespEntity increasePlay(@RequestParam("sheet_ID") int sheet_ID){
        return sheetService.increasePlay(sheet_ID);
    }

}
