package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Song;
import com.jiuge.songs.bean.SongExample;
import com.jiuge.songs.bean.SongVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SongMapper {
    long countByExample(SongExample example);

    int deleteByExample(SongExample example);

    int deleteByPrimaryKey(Integer song_ID);

    int insert(Song record);

    int insertSelective(Song record);

    List<Song> selectByExample(SongExample example);

    Song selectByPrimaryKey(Integer song_ID);

    int updateByExampleSelective(@Param("record") Song record, @Param("example") SongExample example);

    int updateByExample(@Param("record") Song record, @Param("example") SongExample example);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKey(Song record);

    /**
     * 多表查询
     * 通过 歌名or歌手名or风格or语种 查询出相关歌曲的所有关键的信息
     * @param s_name
     * @param si_name
     * @param style
     * @param language
     * @return
     */
    List<SongVO> getSongs(@Param("s_name")String s_name,@Param("si_name") String si_name,@Param("style") String style,@Param("language") String language);

    /**
     * 根据歌手ID进行查询歌曲
     * @param song_ID
     * @return
     */
    SongVO getSongById(int song_ID);

    /**
     * 根据ID精准找到文件名
     * @param song_ID
     * @return
     */
    String getSongFile(int song_ID);

    int getSongPlay(int song_ID);
}