package com.jiuge.songs.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * 歌单里的歌曲信息的特别的类
 * @Author: Cong
 * @Date: 2019/5/12 17:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongsInSheet {
    /**
     * 歌单id
     */
    private int sheet_ID;
    /**
     * 歌单名
     */
    private String sh_name;
    /**
     * 歌曲id
     */
    private int song_ID;
    /**
     * 歌曲名
     */
    private String s_name;
    /**
     * 歌手ID
     */
    private int singer_ID;
    /**
     * 风格（好像没啥用）
     */
    private String style;
    /**
     * 专辑id
     */
    private int album_ID;
    /**
     * 语种（好像没啥用）
     */
    private String language;
    /**
     * 文件名
     */
    private String file;
    /**
     * 歌手名
     */
    private String si_name;
    /**
     * 专辑名
     */
    private String a_name;

    /**
     * 歌曲时长
     */
    private Time duration;

    /**
     * 专辑图
     */
    private String a_image;
}
