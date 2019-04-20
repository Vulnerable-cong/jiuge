package com.jiuge.songs.service;

import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.bean.User;
import com.jiuge.songs.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户服务的实现类
 * @Author: Cong
 * @Date: 2019/4/18 21:12
 */
@Service("UserService")
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;


    /**
     * 登录功能
     * @param account
     * @param password
     * @return
     */
    @Override
    public RespEntity login(String account, String password) {
        User u = userMapper.getUserByAccount(account);
        //默认前端用ajax校验过用户名是否存在，所以这里只检验密码是否正确
        if (u.getU_password().equals(password)) {
            //成功就把这个用户的数据都传输到前台
            return new RespEntity(RespCode.SUCCESS,u);
        }

        return new RespEntity(RespCode.Fail);
    }


    /**
     * 注册功能
     * @param account
     * @param password
     * @return
     */
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public RespEntity register(String account, String password) {
        //默认前端用ajax校验过用户名是否重复，密码是否符合规则，所以在此直接进行插入
        User u = new User(account,password);
        userMapper.insertUser(u);
        return new RespEntity(RespCode.SUCCESS);
    }
}
