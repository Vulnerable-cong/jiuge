package com.jiuge.songs.bean;

/**
 * 收藏（歌单）
 */
public class Collection {
    private int collection_ID;
    private int song_ID;
    private int user_ID;
    private String c_name;

    @Override
    public String toString() {
        return "Collection{" +
                "collection_ID=" + collection_ID +
                ", song_ID=" + song_ID +
                ", user_ID=" + user_ID +
                ", c_name='" + c_name + '\'' +
                '}';
    }

    public int getCollection_ID() {
        return collection_ID;
    }

    public void setCollection_ID(int collection_ID) {
        this.collection_ID = collection_ID;
    }

    public int getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(int song_ID) {
        this.song_ID = song_ID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
}
