package com.windy.user.entity.dto;

import java.io.Serializable;

public class WxLoginReq implements Serializable {
    //登录码
    private String code;

    private String openFlag;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOpenFlag() {
        return openFlag;
    }

    public void setOpenFlag(String openFlag) {
        this.openFlag = openFlag;
    }

    @Override
    public String toString() {
        return "WxLoginReq{" +
                "code='" + code + '\'' +
                ", openFlag='" + openFlag + '\'' +
                '}';
    }
}
