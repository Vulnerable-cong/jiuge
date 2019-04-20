package com.jiuge.songs.bean;

/**
 * 歌手
 */
public class Singer {
    private int singer_ID;
    private String si_name;
    private String gender;
    private String si_image;

    @Override
    public String toString() {
        return "Singer{" +
                "singer_ID=" + singer_ID +
                ", si_name='" + si_name + '\'' +
                ", gender='" + gender + '\'' +
                ", si_image='" + si_image + '\'' +
                '}';
    }

    public int getSinger_ID() {
        return singer_ID;
    }

    public void setSinger_ID(int singer_ID) {
        this.singer_ID = singer_ID;
    }

    public String getSi_name() {
        return si_name;
    }

    public void setSi_name(String si_name) {
        this.si_name = si_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSi_image() {
        return si_image;
    }

    public void setSi_image(String si_image) {
        this.si_image = si_image;
    }
}
