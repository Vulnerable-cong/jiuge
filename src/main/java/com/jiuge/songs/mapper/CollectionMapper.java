package com.jiuge.songs.mapper;

import com.jiuge.songs.bean.Collection;
import org.apache.ibatis.annotations.*;

/**
 * @Author: Cong
 * @Date: 2019/4/18 20:30
 */
public interface CollectionMapper {

    @Select("select collection_ID,song_ID,user_ID,c_name from collection where collection_ID=#{collection_ID}")
    Collection getCollectionById(int collection_ID);

    @Delete("delete from collection where collection_ID=#{collection_ID}")
    int deleteCollectionById(int collection_ID);

    @Options(useGeneratedKeys = true,keyProperty ="collection_ID" )
    @Insert("insert into collection(song_ID,user_ID,c_name) values(#{song_ID},#{user_ID},#{c_name})")
    int insertCollection(Collection collection);

    @Update("update language set song_ID=#{song_ID},user_ID=#{user_ID},c_name=#{c_name} where collection_ID=#{collection_ID}")
    int updateCollection(Collection collection);
}
