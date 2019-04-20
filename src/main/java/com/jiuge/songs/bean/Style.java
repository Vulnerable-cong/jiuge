package com.jiuge.songs.bean;

/**
 * 风格
 */
public class Style {
    private int style_ID;
    private String st_name;
    private String st_image;

    @Override
    public String toString() {
        return "Style{" +
                "style_ID=" + style_ID +
                ", st_name='" + st_name + '\'' +
                ", st_image='" + st_image + '\'' +
                '}';
    }

    public int getStyle_ID() {
        return style_ID;
    }

    public void setStyle_ID(int style_ID) {
        this.style_ID = style_ID;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_image() {
        return st_image;
    }

    public void setSt_image(String st_image) {
        this.st_image = st_image;
    }
}
