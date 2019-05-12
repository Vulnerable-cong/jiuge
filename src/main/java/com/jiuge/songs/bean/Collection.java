package com.jiuge.songs.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 个人收藏
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collection {
    private int collection_ID;
    private int song_ID;
    private int user_ID;
    private String c_name;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createtime;

}
