package com.windy.windy.service.impl;

import com.windy.windy.entity.UserOauth;
import com.windy.windy.mapper.UserOauthMapper;
import com.windy.windy.service.IUserOauthService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户oauth认证表 服务实现类
 * </p>
 *
 * @author chulingliu
 * @since 2021-03-25
 */
@Service
public class UserOauthServiceImpl extends ServiceImpl<UserOauthMapper, UserOauth> implements IUserOauthService {

}
