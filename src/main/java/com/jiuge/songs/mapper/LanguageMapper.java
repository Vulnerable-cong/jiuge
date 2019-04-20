package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Language;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface LanguageMapper {

    @Select("select language_ID,l_name,l_image from language")
    List<Language> getAllLanguage();

    @Select("select language_ID,l_name,l_image from language where l_name=#{l_name}")
    Language getLanguageByName(String l_name);

    @Select("select language_ID,l_name,l_image from language where language_ID=#{language_ID}")
    Language getLangugaeById(int language_ID);

    @Delete("delete from language where language_ID=#{language_ID}")
    int deleteLanguageById(int language_ID);

    @Options(useGeneratedKeys = true,keyProperty ="language_ID" )
    @Insert("insert into language(l_name,l_image) values(#{l_name},#{l_image})")
    int insertLanguage(Language language);

    @Update("update language set l_name=#{l_name},l_image=#{l_image} where language_ID=#{language_ID}")
    int updateLanguage(Language language);
}
