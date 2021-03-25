package com.windy.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.windy.user.dao.UserOauthMapper;
import com.windy.user.entity.UserOauth;
import com.windy.user.service.IUserOauthService;
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
