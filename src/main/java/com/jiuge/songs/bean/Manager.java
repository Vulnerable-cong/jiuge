package com.jiuge.songs.bean;

public class Manager {
    private Integer manager_ID;

    private String m_account;

    private String m_name;

    private String m_password;

    private String m_avatar;

    public Integer getManager_ID() {
        return manager_ID;
    }

    public void setManager_ID(Integer manager_ID) {
        this.manager_ID = manager_ID;
    }

    public String getM_account() {
        return m_account;
    }

    public void setM_account(String m_account) {
        this.m_account = m_account == null ? null : m_account.trim();
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name == null ? null : m_name.trim();
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password == null ? null : m_password.trim();
    }

    public String getM_avatar() {
        return m_avatar;
    }

    public void setM_avatar(String m_avatar) {
        this.m_avatar = m_avatar == null ? null : m_avatar.trim();
    }
}