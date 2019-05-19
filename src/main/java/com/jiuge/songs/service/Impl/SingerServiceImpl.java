package com.jiuge.songs.service.Impl;

import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.bean.Singer;
import com.jiuge.songs.mapper.SingerMapper;
import com.jiuge.songs.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 歌手服务的实现类
 * @Author: Cong
 * @Date: 2019/5/10 16:56
 */
@Service
public class SingerServiceImpl implements SingerService {


    @Autowired
    SingerMapper singerMapper;

    /**
     * 搜索所有歌手 功能
     * @return
     */
    @Override
    public RespEntity findAllSingers() {
        List<Singer> singers = singerMapper.getAllSinger();
        return new RespEntity(RespCode.Success,singers);
    }

    /**
     * 根据歌手名搜索歌手 功能
     * @param si_name
     * @return
     */
    @Override
    public RespEntity findSingersBySingerName(String si_name) {
        List<Singer> singers = singerMapper.getSingerByName(si_name);
        return new RespEntity(RespCode.Success,singers);
    }

    /**
     * 根据性别搜索歌手 功能
     * @param gender
     * @return
     */
    @Override
    public RespEntity findSingersByGender(String gender) {
        List<Singer> singers = singerMapper.getSingerByGender(gender);
        return new RespEntity(RespCode.Success,singers);
    }
}
