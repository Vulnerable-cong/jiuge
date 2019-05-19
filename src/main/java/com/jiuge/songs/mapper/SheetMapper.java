package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Sheet;
import com.jiuge.songs.bean.SongsInSheet;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 歌单Mapper类
 * @Author: Cong
 * @Date: 2019/5/12 14:49
 */
public interface SheetMapper {

    /**
     * 查询所有歌单
     * @return
     */
    @Select("select sheet.* ,user.u_name from sheet Left outer join user on sheet.user_ID = user.user_ID")
    List<Sheet> getAllSheet();

    /**
     * 根据歌单的id查询到对应歌单里的所有歌曲的信息
     * @param sheet_ID
     * @return
     */
    @Select("select sheet.sheet_ID,sheet.sh_name,a.* \n" +
            "from (select t.* , album.a_name, album.a_image\n" +
            "from (select song.* ,singer.si_name\n" +
            "from song Left outer join singer\n" +
            "on song.singer_ID = singer.singer_ID )as t Left outer join album\n" +
            "on t.album_ID = album.album_ID) as a,sheet,sheet_song  \n" +
            "where sheet_song.sheet_ID = sheet.sheet_ID and sheet_song.song_ID = a.song_ID\n" +
            "and sheet.sheet_ID = #{sheet_ID}")
    List<SongsInSheet> getSheetSongsById(int sheet_ID);

    /**
     * 根据歌单名查询歌单
     * @param sh_name
     * @return
     */
    @Select("select sheet.* ,user.u_name from sheet Left outer join user on sheet.user_ID = user.user_ID\n" +
            "where sh_name like CONCAT('%',#{sh_name},'%')")
    List<Sheet> getSheetByName(String sh_name);

    /**
     * 根据语种标签查询歌单
     * @param language
     * @return
     */
    @Select("select sheet.* ,user.u_name from sheet Left outer join user on sheet.user_ID = user.user_ID\n" +
            "where language = #{language}")
    List<Sheet> getSheetByLanguage(String language);

    /**
     * 根据风格标签查询歌单
     * @param style
     * @return
     */
    @Select("select sheet.* ,user.u_name from sheet Left outer join user on sheet.user_ID = user.user_ID\n" +
            "where style = #{style}")
    List<Sheet> getSheetByStyle(String style);

    /**
     * 根据心情标签查询歌单
     * @param mood
     * @return
     */
    @Select("select sheet.* ,user.u_name from sheet Left outer join user on sheet.user_ID = user.user_ID\n" +
            "where mood = #{mood}")
    List<Sheet> getSheetByMood(String mood);

    /**
     * 根据场景标签查询歌单
     * @param scene
     * @return
     */
    @Select("select sheet.* ,user.u_name from sheet Left outer join user on sheet.user_ID = user.user_ID\n" +
            "where scene = #{scene}")
    List<Sheet> getSheetByScene(String scene);


    /**
     * 根据ID精准查出歌单的播放量
     * @param sheet_ID
     * @return
     */
    @Select("select sheet.play from sheet where sheet_ID=#{sheet_ID}")
    int getSheetPlay(int sheet_ID);

    /**
     * 添加歌单（创建）
     * @param sheet
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty ="sheet_ID" )
    @Insert("insert into song(sh_name,user_ID,play,createtime,language,style，mood，scene,sh_image)\n" +
            "values(#{sh_name},#{user_ID},#{play},#{createtime},#{language},#{style},#{mood},#{scene},#{sh_image})")
    int insertSheet(Sheet sheet);

    /**
     * 把歌曲添加进歌单（添加进关系表）
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    @Insert("insert into sheet_song (sheet_ID,song_ID) value(#{sheet_ID},#{song_ID})")
    int insertSongsToSheet(@Param("sheet_ID")int sheet_ID,@Param("song_ID")int song_ID);

    /**
     * 根据歌单id删除歌单
     * @param sheet_ID
     * @return
     */
    @Delete("delete from sheet where sheet_ID=#{sheet_ID}")
    int deleteSheetById(int sheet_ID);

    /**
     * 根据歌单id和歌曲id删除掉它们之间的关系，等于从歌单里删除歌曲
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    @Delete("delete from sheet_song where sheet_ID=#{sheet_ID} and song_ID=#{song_ID}")
    int deleteSongOfSheet(@Param("sheet_ID")int sheet_ID,@Param("song_ID")int song_ID);


    /**
     * 根据歌单id修改对应歌单信息，所属用户，点击率，创建时间没必要修改
     * @param sh_name
     * @param language
     * @param style
     * @param mood
     * @param scene
     * @param sh_image
     * @param sheet_ID
     * @return
     */
    @Update("update sheet t set t.sh_name=#{sh_name},t.language=#{language},t.style=#{style},t.mood=#{mood},t.scene=#{scene},t.sh_image=#{sh_image}\n" +
            "where sheet_ID = #{sheet_ID}")
    int updateSheetById(@Param("sh_name")String sh_name,@Param("language")String language,@Param("style")String style,@Param("mood")String mood,@Param("scene")String scene,@Param("sh_image")String sh_image, @Param("sheet_ID")int sheet_ID);

    /**
     * 修改歌单播放量
     * @param sheet_ID
     * @param play
     * @return
     */
    @Update("update sheet set sheet.play=#{play} where sheet_ID=#{sheet_ID}")
    int updateSheetPlay(@Param("sheet_ID")int sheet_ID,@Param("play")int play);
}
