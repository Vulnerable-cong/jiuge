package com.jiuge.songs.service.Impl;

import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.service.SingerService;
import org.springframework.stereotype.Service;

/**
 * 歌手服务的实现类
 * @Author: Cong
 * @Date: 2019/5/10 16:56
 */
@Service
public class SingerServiceImpl implements SingerService {


    @Override
    public RespEntity findAllSingers() {
        return null;
    }

    @Override
    public RespEntity findSingersBySingerName(String si_name) {
        return null;
    }

    @Override
    public RespEntity findSingersByGender(String gender) {
        return null;
    }
}
