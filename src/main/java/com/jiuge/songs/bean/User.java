package com.jiuge.songs.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * 用户实体类
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
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createtime;

    public User(String u_account, String u_password, Date createtime) {
        this.u_account = u_account;
        this.u_password = u_password;
        this.createtime = createtime;
    }
}
