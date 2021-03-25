package com.windy.user.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户oauth认证表
 * </p>
 *
 * @author chulingliu
 * @since 2021-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserOauth对象", description="用户oauth认证表")
public class UserOauth extends Model<UserOauth> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "第三方登陆类型 weibo、qq、wechat 等")
    private String oauthType;

    @ApiModelProperty(value = "第三方 uid 、openid 等")
    private String oauthId;

    @ApiModelProperty(value = "QQ / 微信同一主体下 Unionid 相同")
    private String unionId;

    @ApiModelProperty(value = "密码凭证 /access_token (目前更多是存储在缓存里)")
    private String credential;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
