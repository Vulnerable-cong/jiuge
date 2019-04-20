package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Song;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SongMapper {

    @Select("select song_ID,s_name,singer_ID,style_ID,album_ID,language_ID,file from song")
    List<Song>getAllSong();

    @Select("select song_ID,s_name,singer_ID,style_ID,album_ID,language_ID,file from song where s_name=#{s_name}")
    Song getSongByName(String s_name);

    @Select("select song_ID,s_name,singer_ID,style_ID,album_ID,language_ID,file from song where song_ID=#{song_ID}")
    Song getSongById(int song_ID);

    @Delete("delete from song where song_ID=#{song_ID}")
    int deleteSongById(int song_ID);

    @Options(useGeneratedKeys = true,keyProperty ="song_ID" )
    @Insert("insert into song(s_name,singer_ID,style_ID,album_ID,language_ID,file) values(#{s_name},#{singer_ID},#{style_ID},#{album_ID},#{language_ID},#{file})")
    int insertSong(Song song);

    @Update("update song set s_name=#{s_name},singer_ID=#{singer_ID},style_ID=#{style_ID},album_ID=#{album_ID}，language_ID=#{language_ID}，file=#{file} where song_ID=#{song_ID}")
    int updateSong(Song song);
}
