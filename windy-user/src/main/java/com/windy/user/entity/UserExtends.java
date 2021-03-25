package com.windy.user.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户扩展表
 * </p>
 *
 * @author chulingliu
 * @since 2021-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserExtends对象", description="用户扩展表")
public class UserExtends extends Model<UserExtends> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "扩展字段")
    private String field;

    @ApiModelProperty(value = "扩展字段值")
    private String value;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
