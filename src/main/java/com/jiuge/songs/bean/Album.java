package com.jiuge.songs.bean;


/**
 * 专辑
 */
public class Album {
    private int album_ID;
    private String a_name;
    private String a_image;



    @Override
    public String toString() {
        return "Album{" +
                "album_ID=" + album_ID +
                ", a_name='" + a_name + '\'' +
                ", a_image='" + a_image + '\'' +
                '}';
    }

    public int getAlbum_ID() {
        return album_ID;
    }

    public void setAlbum_ID(int album_ID) {
        this.album_ID = album_ID;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_image() {
        return a_image;
    }

    public void setA_image(String a_image) {
        this.a_image = a_image;
    }
}
