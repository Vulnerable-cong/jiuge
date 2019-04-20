package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Singer;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SingerMapper {

    @Select("select singer_ID,si_name,gender,si_image from singer")
    List<Singer> getAllSinger();

    @Select("select singer_ID,si_name,gender,si_image from singer where si_name=#{si_name}")
    Singer getSingerByName(String si_name);

    @Select("select singer_ID,si_name,gender,si_image from singer where singer_ID=#{singer_ID}")
    Singer getSingerById(int singer_ID);

    @Delete("delete from singer where singer_ID=#{singer_ID}")
    int deleteSingerById(int singer_ID);

    @Options(useGeneratedKeys = true,keyProperty ="singer_ID" )
    @Insert("insert into language(l_name,l_image) values(#{l_name},#{l_image})")
    int insertSinger(Singer singer);

    @Update("update singer set si_name=#{si_name},gender={gender},si_image=#{si_image} where singer_ID=#{singer_ID}")
    int updateSinger(Singer singer);
}
