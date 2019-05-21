package com.jiuge.songs.bean;

import java.util.Date;

public class Song {
    private Integer song_ID;

    private String s_name;

    private Integer singer_ID;

    private String style;

    private Integer album_ID;

    private String language;

    private String file;

    private Integer play;

    private Date duration;

    public Integer getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(Integer song_ID) {
        this.song_ID = song_ID;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name == null ? null : s_name.trim();
    }

    public Integer getSinger_ID() {
        return singer_ID;
    }

    public void setSinger_ID(Integer singer_ID) {
        this.singer_ID = singer_ID;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public Integer getAlbum_ID() {
        return album_ID;
    }

    public void setAlbum_ID(Integer album_ID) {
        this.album_ID = album_ID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Integer getPlay() {
        return play;
    }

    public void setPlay(Integer play) {
        this.play = play;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

}