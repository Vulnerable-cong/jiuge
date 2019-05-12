package com.jiuge.songs.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 专辑
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {
    private int album_ID;
    private String a_name;
    private String a_image;
    private String a_language;
    private String a_style;

    @Override
    public String toString() {
        return "Album{" +
                "album_ID=" + album_ID +
                ", a_name='" + a_name + '\'' +
                ", a_image='" + a_image + '\'' +
                '}';
    }

}
