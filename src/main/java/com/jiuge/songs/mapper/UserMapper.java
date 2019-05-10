package com.jiuge.songs.mapper;


import com.jiuge.songs.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *  用户的Mapper类
 *  @Author: Cong
 */
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select user_ID,u_account,u_name,u_password,u_avatar from user")
    List<User> getAllUser();

    /**
     * 根据用户ID查询用户
     * @param user_ID
     * @return
     */
    @Select("select u_account,u_name,u_password,u_avatar from user where user_ID=#{user_ID}")
    User getUserById(int user_ID);

    /**
     * 根据用户账号查询用户
     * @param u_account
     * @return
     */
    @Select("select user_ID,u_account,u_name,u_password,u_avatar from user where u_account=#{u_account}")
    User getUserByAccount(String u_account);

    /**
     * 根据用户ID删除用户
     * @param user_ID
     * @return
     */
    @Delete("delete from user where user_ID=#{user_ID}")
    int deleteUserById(int user_ID);

    /**
     * 增加用户
     * @param user
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty ="user_ID" )
    @Insert("insert into user(u_account,u_name,u_password,u_avatar) values(#{u_account},#{u_name},#{u_password},#{u_avatar})")
    int insertUser(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @Update("update user set u_name=#{u_name},u_password=#{u_password},u_avatar=#{u_avatar} where user_ID=#{user_ID}")
    int updateUser(User user);
}
