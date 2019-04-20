package com.jiuge.songs.bean;

/**
 * 管理员
 */
public class Manager {
    private int manager_ID;
    private String m_account;
    private String m_name;
    private String m_password;
    private String m_avatar;

    @Override
    public String toString() {
        return "Manager{" +
                "manager_ID=" + manager_ID +
                ", m_account=" + m_account +
                ", m_name='" + m_name + '\'' +
                ", m_password=" + m_password +
                ", m_avatar='" + m_avatar + '\'' +
                '}';
    }

    public int getManager_ID() {
        return manager_ID;
    }

    public void setManager_ID(int manager_ID) {
        this.manager_ID = manager_ID;
    }

    public String getM_account() {
        return m_account;
    }

    public void setM_account(String m_account) {
        this.m_account = m_account;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password;
    }

    public String getM_avatar() {
        return m_avatar;
    }

    public void setM_avatar(String m_avatar) {
        this.m_avatar = m_avatar;
    }
}
