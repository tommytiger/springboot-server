package com.windy.life.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户详细信息表
 */
@Entity
@Table(name = "user_info")
public class UserInfo extends AudiltModel {
    @Id
    @GeneratedValue()
    private Long id;
}
