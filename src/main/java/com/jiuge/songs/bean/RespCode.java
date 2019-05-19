package com.jiuge.songs.bean;

/**
 * 响应码枚举类
 * @Author: Cong
 * @Date: 2019/4/20 12:03
 */
public enum RespCode {
    //状态码为0则代表成功
    Success(0, "请求成功"),
    //状态码为-1则代表失败
    Fail(-1, "请求失败"),
    //状态码为-2则代表用户不存在
    NoUser(-2,"用户不存在"),
    //
    PwdError(-3,"密码错误");



    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
