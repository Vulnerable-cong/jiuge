package com.jiuge.songs.service.Impl;

import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.bean.User;
import com.jiuge.songs.mapper.UserMapper;
import com.jiuge.songs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

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
            return new RespEntity(RespCode.Success,u);
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

        //注册时把当前时间放入用户表中，记为创建时间，只记到年月日
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");

        //默认前端用ajax校验过用户名是否重复，密码是否符合规则，所以在此直接进行插入
        User u = new User(account,password,date);
        userMapper.insertUser(u);
        return new RespEntity(RespCode.Success);
    }
}
