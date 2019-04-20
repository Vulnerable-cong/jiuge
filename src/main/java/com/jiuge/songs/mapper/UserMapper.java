package com.jiuge.songs.mapper;


import com.jiuge.songs.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *  用户的Mapper类，各种对数据库的操作
 *  @Author: Cong
 */
public interface UserMapper {

    @Select("select user_ID,u_account,u_name,u_password,u_avatar from user")
    List<User> getAllUser();

    @Select("select u_account,u_name,u_password,u_avatar from user where user_ID=#{user_ID}")
    User getUserById(int user_ID);

    @Select("select user_ID,u_account,u_name,u_password,u_avatar from user where u_account=#{u_account}")
    User getUserByAccount(String u_account);

    @Delete("delete from user where user_ID=#{user_ID}")
    int deleteUserById(int user_ID);

    @Options(useGeneratedKeys = true,keyProperty ="user_ID" )
    @Insert("insert into user(u_account,u_name,u_password,u_avatar) values(#{u_account},#{u_name},#{u_password},#{u_avatar})")
    int insertUser(User user);

    @Update("update user set u_name=#{u_name},u_password=#{u_password},u_avatar=#{u_avatar} where user_ID=#{user_ID}")
    int updateUser(User user);
}
