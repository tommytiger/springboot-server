package com.windy.life.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 用户登录表
 */
@Entity
@Table(name = "user_login")
public class User extends AudiltModel{

    //Postgresql自动采用BigSerial作为自增类型(Long)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 1,max = 100)
    private String username;

    @Size(max = 400)
    private String passwd;

}
