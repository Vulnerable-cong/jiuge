package com.jiuge.songs.bean;

/**
 * 语种
 */
public class Language {
    private int language_ID;
    private String l_name;
    private String l_image;

    @Override
    public String toString() {
        return "Language{" +
                "language_ID=" + language_ID +
                ", l_name='" + l_name + '\'' +
                ", l_image='" + l_image + '\'' +
                '}';
    }

    public int getLanguage_ID() {
        return language_ID;
    }

    public void setLanguage_ID(int language_ID) {
        this.language_ID = language_ID;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getL_image() {
        return l_image;
    }

    public void setL_image(String l_image) {
        this.l_image = l_image;
    }
}
