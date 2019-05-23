package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Album;
import com.jiuge.songs.bean.AlbumExample;
import com.jiuge.songs.bean.SongVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlbumMapper {
    long countByExample(AlbumExample example);

    int deleteByExample(AlbumExample example);

    int deleteByPrimaryKey(Integer album_ID);

    int insert(Album record);

    int insertSelective(Album record);

    List<Album> selectByExample(AlbumExample example);

    Album selectByPrimaryKey(Integer album_ID);

    int updateByExampleSelective(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByExample(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);

    /**
     * 获取专辑里的所有歌曲
     * @param akbum_ID
     * @return
     */
    List<SongVO> getSongsByAlbum(int akbum_ID);
}