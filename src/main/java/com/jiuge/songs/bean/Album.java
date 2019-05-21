package com.jiuge.songs.bean;

public class Album {
    private Integer album_ID;

    private String a_name;

    private String a_image;

    private String a_language;

    private String a_style;

    public Integer getAlbum_ID() {
        return album_ID;
    }

    public void setAlbum_ID(Integer album_ID) {
        this.album_ID = album_ID;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name == null ? null : a_name.trim();
    }

    public String getA_image() {
        return a_image;
    }

    public void setA_image(String a_image) {
        this.a_image = a_image == null ? null : a_image.trim();
    }

    public String getA_language() {
        return a_language;
    }

    public void setA_language(String a_language) {
        this.a_language = a_language == null ? null : a_language.trim();
    }

    public String getA_style() {
        return a_style;
    }

    public void setA_style(String a_style) {
        this.a_style = a_style == null ? null : a_style.trim();
    }
}