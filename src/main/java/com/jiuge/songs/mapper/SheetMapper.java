package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Sheet;
import com.jiuge.songs.bean.SheetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SheetMapper {
    long countByExample(SheetExample example);

    int deleteByExample(SheetExample example);

    int deleteByPrimaryKey(Integer sheet_ID);

    int insert(Sheet record);

    int insertSelective(Sheet record);

    List<Sheet> selectByExample(SheetExample example);

    Sheet selectByPrimaryKey(Integer sheet_ID);

    int updateByExampleSelective(@Param("record") Sheet record, @Param("example") SheetExample example);

    int updateByExample(@Param("record") Sheet record, @Param("example") SheetExample example);

    int updateByPrimaryKeySelective(Sheet record);

    int updateByPrimaryKey(Sheet record);
}