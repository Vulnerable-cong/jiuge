package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Album;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AlbumMapper {

    @Select("select album_ID,a_name,a_image from album")
    List<Album> getAllAlbum();

    @Select("select album_ID,a_name,a_image from album where a_name=#{a_name}")
    Album getAlbumByName(String a_name);

    @Select("select album_ID,a_name,a_image from album where a_name=#{a_name}")
    Album getAlbumById(int album_ID);

    @Delete("delete from album where album_ID=#{album_ID}")
    int deleteAlbumById(int album_ID);

    @Options(useGeneratedKeys = true,keyProperty ="album_ID" )
    @Insert("insert into album(a_name,a_image) values(#{a_name},#{a_image})")
    int insertAlbum(Album album);

    @Update("update album set a_name=#{a_name},a_image=#{a_image} where album_ID=#{album_ID}")
    int updateAlbum(Album album);
}
