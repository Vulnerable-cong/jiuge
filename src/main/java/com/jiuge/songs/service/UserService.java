package com.jiuge.songs.service;

import com.jiuge.songs.bean.RespEntity;

/**
 * 用户管理服务类
 * @Author: Cong
 * @Date: 2019/4/18 21:05
 */
public interface UserService {

    /**
     * 登录服务
     * @param account
     * @param password
     * @return
     */
    RespEntity login (String account, String password);


    /**
     * 注册服务
     * @param account
     * @param password
     * @return
     */
    RespEntity register(String account, String password);
}
