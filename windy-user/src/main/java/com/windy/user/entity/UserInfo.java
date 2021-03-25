package com.windy.user.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author chulingliu
 * @since 2021-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserInfo对象", description="用户信息表")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户昵称")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "用户状态")
    private Integer status;

    private String delFlag;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
