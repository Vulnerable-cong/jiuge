package com.jiuge.songs.service.Impl;

import com.jiuge.songs.bean.*;
import com.jiuge.songs.mapper.AlbumMapper;
import com.jiuge.songs.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 专辑服务的实现类
 * @Author: Cong
 * @Date: 2019/5/10 17:11
 */
@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    AlbumMapper albumMapper;

    /**
     * 搜索所有专辑
     * @return
     */
    @Override
    public RespEntity findAllAlbums() {
        AlbumExample albumExample = new AlbumExample();
        List<Album> albums = albumMapper.selectByExample(albumExample);
        return new RespEntity(RespCode.Success,albums);
    }


    /**
     * 根据专辑名搜索专辑
     * @param a_name
     * @return
     */
    @Override
    public RespEntity findAlbumsByAlbumName(String a_name) {
        AlbumExample albumExample = new AlbumExample();
        AlbumExample.Criteria criteria = albumExample.createCriteria();
        criteria.andA_nameLike("%"+a_name+"%");
        List<Album> albums = albumMapper.selectByExample(albumExample);
        return new RespEntity(RespCode.Success,albums);
    }

    /**
     * 搜索指定专辑里的歌曲
     * @param album_ID
     * @return
     */
    @Override
    public RespEntity findSongsByAlbum(int album_ID) {
        List<SongVO> songs = albumMapper.getSongsByAlbum(album_ID);
        return new RespEntity(RespCode.Success,songs);
    }
}
