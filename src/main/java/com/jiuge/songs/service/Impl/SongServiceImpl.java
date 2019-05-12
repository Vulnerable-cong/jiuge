package com.jiuge.songs.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.bean.Song;
import com.jiuge.songs.mapper.SongMapper;
import com.jiuge.songs.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 歌曲服务的实现类
 * @Author: Cong
 * @Date: 2019/5/10 16:26
 */
@Service("SongService")
public class SongServiceImpl implements SongService {

    @Autowired
    SongMapper songMapper;

    /**
     * 搜索所有歌曲 功能,支持分页查询
     * @return
     */
    @Override
    public RespEntity findAllSongs(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Song> songs = songMapper.getAllSongs();
        PageInfo<Song> songPageInfo = new PageInfo<Song>(songs);
        return new RespEntity(RespCode.Success,songPageInfo);
    }

    /**
     * 根据歌名搜索歌曲 功能
     * @param s_name
     * @return
     */
    @Override
    public RespEntity findSongsBySongName(String s_name) {
        List<Song> songs = songMapper.getSongsByName(s_name);
        return new RespEntity(RespCode.Success,songs);
    }

    /**
     * 根据歌手名搜索歌曲 功能
     * @param si_name
     * @return
     */
    @Override
    public RespEntity findSongsBySingerName(String si_name) {
        List<Song> songs = songMapper.getSongsBySingerName(si_name);
        return new RespEntity(RespCode.Success,songs);
    }

    /**
     * 根据风格搜索歌曲 功能
     * @param style
     * @return
     */
    @Override
    public RespEntity findSongsByStyle(String style) {
        List<Song> songs = songMapper.getSongsByStyle(style);
        return new RespEntity(RespCode.Success,songs);
    }

    /**
     * 根据语种搜索歌曲 功能
     * @param language
     * @return
     */
    @Override
    public RespEntity findSongsByLanguage(String language) {
        List<Song> songs = songMapper.getSongByLanguage(language);
        return new RespEntity(RespCode.Success,songs);
    }

    /**
     * 根据ID精准搜索歌曲 功能
     * @param song_ID
     * @return
     */
    @Override
    public RespEntity findSongById(int song_ID) {
        Song song = songMapper.getSongById(song_ID);
        return new RespEntity(RespCode.Success,song);
    }

}
