package com.jiuge.songs.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 * 试用lombok
 * @Author: Cong
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int user_ID;
    private String u_account;
    private String u_name;
    private String u_password;
    private String u_avatar;

    public User(String u_account, String u_password) {
        this.u_account = u_account;
        this.u_password = u_password;
    }
}
