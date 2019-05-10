package com.jiuge.songs.service.Impl;

import com.jiuge.songs.bean.Album;
import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
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
@Service("AlbumService")
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    AlbumMapper albumMapper;

    /**
     * 搜索所有专辑
     * @return
     */
    @Override
    public RespEntity findAllAlbums() {
        List<Album> albums = albumMapper.getAllAlbum();
        return new RespEntity(RespCode.Success,albums);
    }

    /**
     * 根据专辑名搜索专辑
     * @param a_name
     * @return
     */
    @Override
    public RespEntity findAlbumsByAlbumName(String a_name) {
        List<Album> albums = albumMapper.getAlbumByName(a_name);
        return new RespEntity(RespCode.Success,albums);
    }
}
