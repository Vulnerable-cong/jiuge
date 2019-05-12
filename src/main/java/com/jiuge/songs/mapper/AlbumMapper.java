package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Album;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 专辑的Mapper类
 */
public interface AlbumMapper {

    /**
     * 查询所有专辑
     * @return
     */
    @Select("select album.* from album")
    List<Album> getAllAlbum();

    /**
     * 根据专辑名查询专辑，支持模糊查询
     * @param a_name
     * @return
     */
    @Select("select album.* from album where a_name like CONCAT('%',#{a_name},'%')")
    List<Album> getAlbumByName(String a_name);

    /**
     * 根据专辑ID查询专辑
     * @param album_ID
     * @return
     */
    @Select("select album.* from album where a_name=#{a_name}")
    Album getAlbumById(int album_ID);

    /**
     * 根据语种查询专辑
     * @param a_language
     * @return
     */
    @Select("select album.* from album where a_language=#{a_language}")
    List<Album> getAlbumByLanguage(String a_language);

    /**
     * 根据风格查询专辑
     * @param a_style
     * @return
     */
    @Select("select album.* from album where a_style=#{a_style}")
    List<Album> getAlbumByStyle(String a_style);



    /**
     * 根据专辑ID删除专辑
     * @param album_ID
     * @return
     */
    @Delete("delete from album where album_ID=#{album_ID}")
    int deleteAlbumById(int album_ID);

    /**
     * 增加专辑
     * @param album
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty ="album_ID" )
    @Insert("insert into album(a_name,a_image,a_language,a_style)\n" +
            "values(#{a_name},#{a_image},#{a_language},#{a_style})")
    int insertAlbum(Album album);

    /**
     * 修改专辑信息
     * @param album
     * @return
     */
    @Update("update album set a_name=#{a_name},a_image=#{a_image}\n" +
            ",a_language=#{a_language},a_style=#{a_style} where album_ID=#{album_ID}")
    int updateAlbum(Album album);
}
