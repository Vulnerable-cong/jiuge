package com.jiuge.songs.bean;

import java.util.Date;

public class Collection {
    private Integer collection_ID;

    private Integer song_ID;

    private Integer user_ID;

    private String c_name;

    private Date createtime;

    public Integer getCollection_ID() {
        return collection_ID;
    }

    public void setCollection_ID(Integer collection_ID) {
        this.collection_ID = collection_ID;
    }

    public Integer getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(Integer song_ID) {
        this.song_ID = song_ID;
    }

    public Integer getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Integer user_ID) {
        this.user_ID = user_ID;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name == null ? null : c_name.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}