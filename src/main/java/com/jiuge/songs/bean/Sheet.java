package com.jiuge.songs.bean;

import java.util.Date;

public class Sheet {
    private Integer sheet_ID;

    private String sh_name;

    private Integer user_ID;

    private Integer play;

    private Date createtime;

    private String language;

    private String style;

    private String mood;

    private String scene;

    private String sh_image;

    public Integer getSheet_ID() {
        return sheet_ID;
    }

    public void setSheet_ID(Integer sheet_ID) {
        this.sheet_ID = sheet_ID;
    }

    public String getSh_name() {
        return sh_name;
    }

    public void setSh_name(String sh_name) {
        this.sh_name = sh_name == null ? null : sh_name.trim();
    }

    public Integer getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Integer user_ID) {
        this.user_ID = user_ID;
    }

    public Integer getPlay() {
        return play;
    }

    public void setPlay(Integer play) {
        this.play = play;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood == null ? null : mood.trim();
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    public String getSh_image() {
        return sh_image;
    }

    public void setSh_image(String sh_image) {
        this.sh_image = sh_image == null ? null : sh_image.trim();
    }
}