package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Style;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StyleMapper {

    @Select("select style_ID,st_name,st_image from style")
    List<Style>getAllStyle();

    @Select("select style_ID,st_name,st_image from style where st_name=#{st_name}")
    Style getStyleByName(String st_name);

    @Select("select style_ID,st_name,st_image from style where style_ID=#{style_ID}")
    Style getStyleById(int style_ID);

    @Delete("delete from style where style_ID=#{style_ID}")
    int deleteStyleById(int style_ID);

    @Options(useGeneratedKeys = true,keyProperty ="style_ID" )
    @Insert("insert into style(st_name,st_image) values(#{st_name},#{st_image})")
    int insertStyle(Style style);

    @Update("update style set st_name=#{st_name},st_image=#{st_image} where style_ID=#{style_ID}")
    int updateStyle(Style style);
}
