package com.jiuge.songs.bean;

/**
 * 歌曲
 */
public class Song {
    private int song_ID;
    private String s_name;
    private int singer_ID;
    private int style_ID;
    private int album_ID;
    private int language_ID;
    private String file;

    public int getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(int song_ID) {
        this.song_ID = song_ID;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getSinger_ID() {
        return singer_ID;
    }

    public void setSinger_ID(int singer_ID) {
        this.singer_ID = singer_ID;
    }

    public int getStyle_ID() {
        return style_ID;
    }

    public void setStyle_ID(int style_ID) {
        this.style_ID = style_ID;
    }

    public int getAlbum_ID() {
        return album_ID;
    }

    public void setAlbum_ID(int album_ID) {
        this.album_ID = album_ID;
    }

    public int getLanguage_ID() {
        return language_ID;
    }

    public void setLanguage_ID(int language_ID) {
        this.language_ID = language_ID;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
