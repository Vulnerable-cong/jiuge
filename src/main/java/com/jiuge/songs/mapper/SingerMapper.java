package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Singer;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 歌手的Mapper类
 * @Author: Cong
 */
public interface SingerMapper {

    /**
     * 查询所有歌手
     * @return
     */
    @Select("select singer_ID,si_name,gender,si_image from singer")
    List<Singer> getAllSinger();

    /**
     * 根据歌手名查询歌手，支持模糊查询
     * @param si_name
     * @return
     */
    @Select("select singer_ID,si_name,gender,si_image from singer where si_name like CONCAT('%',#{si_name},'%')")
    List<Singer> getSingerByName(String si_name);

    /**
     * 根据歌手ID查询歌手
     * @param singer_ID
     * @return
     */
    @Select("select singer_ID,si_name,gender,si_image from singer where singer_ID=#{singer_ID}")
    Singer getSingerById(int singer_ID);

    /**
     * 根据歌手ID查询到对应的歌手名
     * @param singer_ID
     * @return
     */
    @Select("select si_name from singer where singer_ID=#{singer_ID}")
    Singer getSingerNameById(int singer_ID);

    /**
     * 根据性别查询歌手
     * @param gender
     * @return
     */
    @Select("select singer_ID,si_name,gender,si_image from singer where gender=#{gender}")
    List<Singer> getSingerByGender(String gender);

    /**
     * 根据歌手ID删除歌手
     * @param singer_ID
     * @return
     */
    @Delete("delete from singer where singer_ID=#{singer_ID}")
    int deleteSingerById(int singer_ID);

    /**
     * 增加歌手
     * @param singer
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty ="singer_ID" )
    @Insert("insert into singer(si_name,gender,si_image) values(#{si_name},#{gender},#{si_image})")
    int insertSinger(Singer singer);

    /**
     * 修改歌手信息
     * @param singer
     * @return
     */
    @Update("update singer set si_name=#{si_name},gender={gender},si_image=#{si_image} where singer_ID=#{singer_ID}")
    int updateSinger(Singer singer);
}
