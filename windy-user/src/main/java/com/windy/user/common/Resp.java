package com.windy.user.common;

/**
 * 统一返回结果
 */
public class Resp<T> {
    /**
     * 响应码
     */
    private String code;
    /**
     * 信息
     */
    private String msg;
    /**
     * 响应数据
     */
    private T  data;



}
