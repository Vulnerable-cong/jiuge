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
     * @param pageNum
     * @return
     */
    RespEntity findAllSingers(int pageNum);

    /**
     * 根据歌手名搜索歌手
     * @param pageNum
     * @param si_name
     * @return
     */
    RespEntity findSingersBySiN(int pageNum,String si_name);

    /**
     * 根据三个条件搜索歌手
     * @param pageNum
     * @param gender
     * @param area
     * @param label
     * @return
     */
    RespEntity findSingersByExample(int pageNum,String gender,String area, String label);
}