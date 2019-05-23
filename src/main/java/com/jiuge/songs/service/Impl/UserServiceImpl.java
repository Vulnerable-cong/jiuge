package com.jiuge.songs.service.Impl;

import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.bean.User;
import com.jiuge.songs.bean.UserExample;
import com.jiuge.songs.mapper.UserMapper;
import com.jiuge.songs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 用户服务的实现类
 * @Author: Cong
 * @Date: 2019/4/18 21:12
 */
@Service
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
        List<User> u = null;
        try {
            UserExample userExample  = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andU_accountEqualTo(account);
            //根据账号查找用户
            u = userMapper.selectByExample(userExample);
        } catch (NullPointerException e) {
            e.printStackTrace();

        }
        if (u == null) {
            //返回没有此用户的消息
            return new RespEntity(RespCode.NoUser);
        } else if (u.get(0).getU_password().equals(password)) {
            //成功就把这个用户的数据都传输到前台
            return new RespEntity(RespCode.Success, u);
        } else {
            //返回密码错误的消息
            return new RespEntity(RespCode.PwdError);
        }
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
        User u = new User(account,password,date);
        //默认前端用ajax校验过用户名是否重复，密码是否符合规则，所以在此直接进行插入
        int i = userMapper.insertSelective(u);
        if (i == 1){
            return new RespEntity(RespCode.Success);
        }else {
            return new RespEntity(RespCode.Fail);
        }
    }
}
