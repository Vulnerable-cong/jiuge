package com.jiuge.songs.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 歌手
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Singer {
    private int singer_ID;
    private String si_name;
    private String gender;
    private String si_image;
    /**
     * 地区
     */
    private String area;
    /**
     * 歌手的标签，如流行、嘻哈、摇滚
     */
    private String label;


}
