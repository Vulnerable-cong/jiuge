package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Manager;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ManagerMapper {

    @Select("select manager_ID,m_account,m_name,m_password,m_avatar from manager")
    List<Manager> getAllManager();

    @Select("select manager_ID,m_account,m_name,m_password m_avatar from manager where manager_ID=#{manager_ID}")
    Manager getManagerById(int manager_ID);

    @Delete("delete from manager where manager_ID=#{manager_ID}")
    int deleteUserById(int user_ID);

    @Options(useGeneratedKeys = true,keyProperty ="manager_ID" )
    @Insert("insert into manager(m_account,m_name,m_password,m_avatar) values(#{m_account},#{m_name},#{m_password},#{m_avatar})")
    int insertUser(Manager manager);

    @Update("update manager set m_name=#{m_name},m_password=#{m_password},m_avatar=#{m_avatar} where manager_ID=#{manager_ID}")
    int updateUser(Manager manager);
}
