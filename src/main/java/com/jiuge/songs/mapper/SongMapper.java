package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Song;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 歌曲的Mapper类
 * @Author: Cong
 */
public interface SongMapper {

    /**
     * 查询所有歌曲
     * @return
     */
    @Select("select t.* , album.a_name, album.a_image\n" +
            "from (select song.song_ID,song.s_name,song.singer_ID,singer.si_name,song.style,song.language,song.play,song.duration,song.album_ID\n" +
            "from song Left outer join singer\n" +
            "on song.singer_ID = singer.singer_ID )as t Left outer join album\n" +
            "on t.album_ID = album.album_ID")
    List<Song>getAllSongs();

    /**
     * 根据歌名进行查询歌曲，支持模糊查询
     * @param s_name
     * @return
     */
    @Select("select t.* , album.a_name, album.a_image\n" +
            "from (select song.song_ID,song.s_name,song.singer_ID,singer.si_name,song.style,song.language,song.play,song.duration,song.album_ID\n" +
            "from song Left outer join singer\n" +
            "on song.singer_ID = singer.singer_ID )as t Left outer join album\n" +
            "on t.album_ID = album.album_ID\n" +
            "where s_name like CONCAT('%',#{s_name},'%')")
    List<Song>getSongsByName(String s_name);

    /**
     * 根据歌曲ID进行查询歌曲
     * @param song_ID
     * @return
     */
    @Select("select t.* , album.a_name, album.a_image\n" +
            "from (select song.song_ID,song.s_name,song.singer_ID,singer.si_name,song.style,song.language,song.play,song.duration,song.album_ID\n" +
            "from song Left outer join singer\n" +
            "on song.singer_ID = singer.singer_ID )as t Left outer join album\n" +
            "on t.album_ID = album.album_ID\n" +
            "where song_ID=#{song_ID}")
    Song getSongById(int song_ID);

    /**
     * 根据歌手ID进行查询歌曲
     * @param singer_ID
     * @return
     */
    @Select("select t.* , album.a_name, album.a_image\n" +
            "from (select song.song_ID,song.s_name,song.singer_ID,singer.si_name,song.style,song.language,song.play,song.duration,song.album_ID\n" +
            "from song Left outer join singer\n" +
            "on song.singer_ID = singer.singer_ID )as t Left outer join album\n" +
            "on t.album_ID = album.album_ID\n" +
            "where singer_ID=#{singer_ID}")
    List<Song>getSongsBySingerID(int singer_ID);

    /**
     * 根据歌手名进行查询歌曲，支持模糊查询
     * @param si_name
     * @return
     */
    @Select("select t.* , album.a_name, album.a_image\n" +
            "from (select song.song_ID,song.s_name,song.singer_ID,singer.si_name,song.style,song.language,song.play,song.duration,song.album_ID\n" +
            "from song Left outer join singer\n" +
            "on song.singer_ID = singer.singer_ID )as t Left outer join album\n" +
            "on t.album_ID = album.album_ID\n" +
            "where si_name like CONCAT('%',#{si_name},'%')")
    List<Song>getSongsBySingerName(String si_name);

    /**
     * 根据风格进行查询歌曲
     * @param style
     * @return
     */
    @Select("select t.* , album.a_name, album.a_image\n" +
            "from (select song.song_ID,song.s_name,song.singer_ID,singer.si_name,song.style,song.language,song.play,song.duration,song.album_ID\n" +
            "from song Left outer join singer\n" +
            "on song.singer_ID = singer.singer_ID )as t Left outer join album\n" +
            "on t.album_ID = album.album_ID\n" +
            "where style = #{style}")
    List<Song>getSongsByStyle(String style);

    /**
     * 根据语种进行查询歌曲
     * @param language
     * @return
     */
    @Select("select t.* , album.a_name, album.a_image\n" +
            "from (select song.song_ID,song.s_name,song.singer_ID,singer.si_name,song.style,song.language,song.play,song.duration,song.album_ID\n" +
            "from song Left outer join singer\n" +
            "on song.singer_ID = singer.singer_ID )as t Left outer join album\n" +
            "on t.album_ID = album.album_ID\n" +
            "where language = #{language}")
    List<Song>getSongByLanguage(String language);


    /**
     * 根据ID精准找到文件名
     * @param song_ID
     * @return
     */
    @Select("select song.file from song where song_ID=#{song_ID}")
    String getSongFile(int song_ID);

    /**
     * 根据ID精准查出歌曲的播放量
     * @param song_ID
     * @return
     */
    @Select("select song.play from song where song_ID=#{song_ID}")
    int getSongPlay(int song_ID);

    /**
     * 根据歌曲ID删除歌曲
     * @param song_ID
     * @return
     */
    @Delete("delete from song where song_ID=#{song_ID}")
    int deleteSongById(int song_ID);

    /**
     * 增加歌曲
     * @param song
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty ="song_ID" )
    @Insert("insert into song(s_name,singer_ID,style,album_ID,language,file,duration) values(#{s_name},#{singer_ID},#{style},#{album_ID},#{language},#{file},#{duration})")
    int insertSong(Song song);

    /**
     * 修改歌曲信息
     * @param song
     * @return
     */
    @Update("update song set s_name=#{s_name},singer_ID=#{singer_ID},style=#{style},album_ID=#{album_ID}，language=#{language}，file=#{file}, duration=#{duration} where song_ID=#{song_ID}")
    int updateSongById(Song song);

    /**
     * 修改歌曲播放量
     * @param song_ID
     * @param play
     * @return
     */
    @Update("update song set song.play=#{play} where song_ID=#{song_ID}")
    int updateSongPlay(@Param("song_ID")int song_ID,@Param("play")int play);
}
