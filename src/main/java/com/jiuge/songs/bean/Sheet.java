package com.jiuge.songs.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 歌单
 * @Author: Cong
 * @Date: 2019/5/12 14:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheet {
    private int sheet_ID;
    private String sh_name;
    private int user_ID;
    private int clicktime;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createtime;
    /**
     * 语种分类标签
     */
    private String language;
    /**
     * 风格分类标签
     */
    private String style;
    /**
     * 心情分类标签
     */
    private String mood;
    /**
     * 场景分类标签
     */
    private String scene;


    public Sheet(String sh_name, int user_ID, int clicktime, Date createtime, String language, String style, String mood, String scene) {
        this.sh_name = sh_name;
        this.user_ID = user_ID;
        this.clicktime = clicktime;
        this.createtime = createtime;
        this.language = language;
        this.style = style;
        this.mood = mood;
        this.scene = scene;
    }
}
