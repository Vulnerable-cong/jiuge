package com.jiuge.songs.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * @Author: Cong
 * @Date: 2019/5/21 20:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongVO {

    private Integer song_ID;

    private String s_name;

    private Integer singer_ID;

    private String si_name;

    private String style;

    private Integer album_ID;

    private String a_name;

    private String a_image;

    private String language;

    private String file;

    /**
     * 时长 （HH：mm：ss）
     */
    private Time duration;

    /**
     * 播放量
     */
    private int play;
}
