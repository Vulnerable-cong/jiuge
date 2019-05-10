package com.jiuge.songs.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 歌曲实体类
 * @Author: Cong
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    private int song_ID;
    private String s_name;
    private int singer_ID;
    private String si_name;
    private String style;
    private int album_ID;
    private String a_name;
    private String language;
    private String file;

}

