package com.jiuge.songs.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiuge.songs.bean.RespCode;
import com.jiuge.songs.bean.RespEntity;
import com.jiuge.songs.bean.Singer;
import com.jiuge.songs.bean.SingerExample;
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
     * 条件查询
     * @param example
     * @return
     */
    private RespEntity find(int pageNum, SingerExample example){
        PageHelper.startPage(pageNum, 10);
        List<Singer> singers = singerMapper.selectByExample(example);
        PageInfo<Singer> songPageInfo = new PageInfo<>(singers);
        return new RespEntity(RespCode.Success,songPageInfo);
    }

    /**
     * 搜索所有歌手
     * @param pageNum
     * @return
     */
    @Override
    public RespEntity findAllSingers(int pageNum) {
        SingerExample singerExample = new SingerExample();
        return find(pageNum,singerExample);
    }

    /**
     * 根据歌手名搜索歌手，支持模糊查询
     * @param pageNum
     * @param si_name
     * @return
     */
    @Override
    public RespEntity findSingersBySiN(int pageNum,String si_name) {
        SingerExample singerExample = new SingerExample();
        SingerExample.Criteria criteria = singerExample.createCriteria();
        criteria.andSi_nameLike("%" + si_name + "%");
        return find(pageNum,singerExample);
    }

    /**
     * 根据三个条件查询歌手
     * @param pageNum
     * @param gender
     * @param area
     * @param label
     * @return
     */
    @Override
    public RespEntity findSingersByExample(int pageNum, String gender, String area, String label) {
        SingerExample singerExample = new SingerExample();
        SingerExample.Criteria criteria = singerExample.createCriteria();
        if (gender != null && gender.length() != 0) {
            criteria.andGenderEqualTo(gender);
        }
        if (area != null && area.length() != 0) {
            criteria.andAreaEqualTo(area);
        }
        if (label != null && label.length() != 0) {
            criteria.andLabelEqualTo(label);
        }
        return find(pageNum,singerExample);
    }
}
