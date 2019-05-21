package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Singer;
import com.jiuge.songs.bean.SingerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SingerMapper {
    long countByExample(SingerExample example);

    int deleteByExample(SingerExample example);

    int deleteByPrimaryKey(Integer singer_ID);

    int insert(Singer record);

    int insertSelective(Singer record);

    List<Singer> selectByExample(SingerExample example);

    Singer selectByPrimaryKey(Integer singer_ID);

    int updateByExampleSelective(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExample(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);
}