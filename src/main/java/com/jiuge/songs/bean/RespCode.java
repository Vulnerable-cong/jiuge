package com.jiuge.songs.bean;

/**
 * 响应码枚举类
 * @Author: Cong
 * @Date: 2019/4/20 12:03
 */
public enum RespCode {
    //状态码为0则代表成功
    SUCCESS(0, "成功"),
    //状态码为-1则代表失败
    Fail(-1, "失败");

    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
