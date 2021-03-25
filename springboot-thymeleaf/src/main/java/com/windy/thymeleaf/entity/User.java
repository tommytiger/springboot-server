package com.windy.thymeleaf.entity;

import java.io.Serializable;

/**
 * @Classname User
 * @Description TODO
 * @Date 2021/1/22 10:33
 * @Created by liuch
 */
public class User implements Serializable {


    private String id;

    private String username;

    private String passwd;


    public User() {
    }

    public User(String id, String username, String passwd) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
