package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Sheet;
import com.jiuge.songs.bean.SheetExample;
import com.jiuge.songs.bean.SongsInSheet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SheetMapper {
    long countByExample(SheetExample example);

    int deleteByExample(SheetExample example);

    int deleteByPrimaryKey(Integer sheet_ID);

    int insert(Sheet record);

    int insertSelective(Sheet record);

    List<Sheet> selectByExample(SheetExample example);

    Sheet selectByPrimaryKey(Integer sheet_ID);

    int updateByExampleSelective(@Param("record") Sheet record, @Param("example") SheetExample example);

    int updateByExample(@Param("record") Sheet record, @Param("example") SheetExample example);

    int updateByPrimaryKeySelective(Sheet record);

    int updateByPrimaryKey(Sheet record);

    /**
     * 拿到歌单里的所有歌曲
     * @param sheet_ID
     * @return
     */
    List<SongsInSheet> getSongsInSheet(int sheet_ID);

    /**
     * 拿到指定歌曲播放量
     * @param sheet_ID
     * @return
     */
    int getSheetPlay(int sheet_ID);

    /**
     * 增加歌曲进歌单，加进关系表
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    int insertSongsToSheet(@Param("sheet_ID") int sheet_ID, @Param("song_ID") int song_ID);

    /**
     * 删除歌单里所有歌，即删除关系表里有该歌单的所有记录
     * @param sheet_ID
     */
    void deleteAllSongInSheet(int sheet_ID);

    /**
     * 删除歌单里的某一首歌
     * @param sheet_ID
     * @param song_ID
     * @return
     */
    int deleteSIS(@Param("sheet_ID")int sheet_ID,@Param("song_ID")int song_ID);
}