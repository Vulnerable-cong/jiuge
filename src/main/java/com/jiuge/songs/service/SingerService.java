package com.jiuge.songs.service;

import com.jiuge.songs.bean.RespEntity;

/**
 * 歌手服务类
 * @Author: Cong
 * @Date: 2019/5/10 16:47
 */
public interface SingerService {
    /**
     * 搜索所有歌手
     *
     * @return
     */
    RespEntity findAllSingers();

    /**
     * 根据歌手名搜索歌手
     *
     * @param si_name
     * @return
     */
    RespEntity findSingersBySingerName(String si_name);

    /**
     * 根据性别搜索歌手
     * @return
     */
    RespEntity findSingersByGender(String gender);
}