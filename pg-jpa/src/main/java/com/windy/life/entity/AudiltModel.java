package com.windy.life.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author liuch
 * 审计模型
 */
@MappedSuperclass        //必须,为了让子类定义的表能拥有继承的字段
@EntityListeners(AuditingEntityListener.class)
public abstract class AudiltModel implements Serializable {

    @Temporal(TemporalType.TIMESTAMP)  //声明日期类型的对应格式
    @Column(name = "create_time",nullable = false,updatable = false)
    @CreatedDate
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time",nullable = false)
    @LastModifiedDate
    private Date updateTime;

}
