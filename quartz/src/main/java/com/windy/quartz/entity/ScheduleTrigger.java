package com.windy.quartz.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author chulingliu
 * @since 2021-03-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ScheduleTrigger对象", description="")
public class ScheduleTrigger extends Model<ScheduleTrigger> {

    private static final long serialVersionUID = 1L;
    private String id;

    private String cron;

    private String status;

    private String jobName;

    private String jobGroup;


    @Override
    protected Serializable pkVal() {
        return id;
    }

}
