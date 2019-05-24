package com.jiuge.songs.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.bean.Song;
import com.jiuge.songs.bean.SongVO;
import com.jiuge.songs.mapper.SongMapper;
import com.jiuge.songs.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 歌曲服务的实现类
 * @Author: Cong
 * @Date: 2019/5/10 16:26
 */
@Service
public class SongServiceImpl implements SongService {

    public static final int INDEXSONGNUM = 6;

    @Autowired
    SongMapper songMapper;

    /**
     * 搜索歌曲，通过歌名or歌手名or风格or语种搜索
     * @param pageNum
     * @param s_name
     * @param si_name
     * @param style
     * @param language
     * @return
     */
    @Override
    public RespEntity findSongs(int pageNum, String s_name, String si_name, String style, String language) {
        PageHelper.startPage(pageNum, 10);
        List<SongVO> songs = songMapper.getSongs(s_name,si_name,style,language);
        PageInfo<SongVO> songPageInfo = new PageInfo<>(songs);
        return new RespEntity(RespCode.Success,songPageInfo);
    }

    /**
     * 根据ID精准搜索歌曲
     * @param song_ID
     * @return
     */
    @Override
    public RespEntity findSongById(int song_ID) {
        SongVO song = songMapper.getSongById(song_ID);
        return new RespEntity(RespCode.Success,song);
    }

    /**
     * 根据歌曲ID找到歌曲文件名
     * 播放时发送请求执行的操作
     * @param song_ID
     * @return
     */
    @Override
    public RespEntity findSongFile(int song_ID) {
        String file = songMapper.getSongFile(song_ID);
        return new RespEntity(RespCode.Success,file);
    }

    /**
     * 增加播放量
     * 每次加一
     * @param song_ID
     * @return
     */
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public RespEntity increasePlay(int song_ID) {
        int play = songMapper.getSongPlay(song_ID);
        play++;
        Song song = new Song();
        song.setSong_ID(song_ID);
        song.setPlay(play);
        songMapper.updateByPrimaryKeySelective(song);
        return new RespEntity(RespCode.Success);
    }

    /**
     * 拿到主页需要的歌
     * @return
     */
    @Override
    public RespEntity indexSong() {
        List<SongVO> songs = new ArrayList<>();
        int[] id = {1,9,13,16,18,20};
        for (int i = 0; i < INDEXSONGNUM; i++) {
            songs.add(songMapper.getSongById(id[i]));
        }
        return new RespEntity(RespCode.Success,songs);
    }
}
