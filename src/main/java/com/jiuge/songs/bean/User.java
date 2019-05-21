package com.jiuge.songs.bean;

import java.util.Date;

public class User {
    private Integer user_ID;

    private String u_account;

    private String u_name;

    private String u_password;

    private String u_avatar;

    private Date createtime;

    public Integer getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Integer user_ID) {
        this.user_ID = user_ID;
    }

    public String getU_account() {
        return u_account;
    }

    public void setU_account(String u_account) {
        this.u_account = u_account == null ? null : u_account.trim();
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name == null ? null : u_name.trim();
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password == null ? null : u_password.trim();
    }

    public String getU_avatar() {
        return u_avatar;
    }

    public void setU_avatar(String u_avatar) {
        this.u_avatar = u_avatar == null ? null : u_avatar.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public User(String u_name, String u_password, Date createtime) {
        this.u_name = u_name;
        this.u_password = u_password;
        this.createtime = createtime;
    }
}