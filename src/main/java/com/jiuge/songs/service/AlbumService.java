package com.jiuge.songs.service;

import com.jiuge.songs.bean.RespEntity;

/**
 * 专辑服务类
 * @Author: Cong
 * @Date: 2019/5/10 17:06
 */
public interface AlbumService {

    /**
     * 搜索所有专辑
     * @return
     */
    RespEntity findAllAlbums();

    /**
     * 根据专辑名搜索专辑
     * @param a_name
     * @return
     */
    RespEntity findAlbumsByAlbumName(String a_name);

}
