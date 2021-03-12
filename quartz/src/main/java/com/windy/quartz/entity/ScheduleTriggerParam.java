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
@ApiModel(value="ScheduleTriggerParam对象", description="")
public class ScheduleTriggerParam extends Model<ScheduleTriggerParam> {

    private static final long serialVersionUID = 1L;

    private String paramId;

    private String name;

    private String value;

    private String scheduleTriggerId;


    @Override
    protected Serializable pkVal() {
        return this.paramId;
    }

}
