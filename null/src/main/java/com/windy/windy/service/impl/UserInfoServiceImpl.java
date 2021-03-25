package com.windy.windy.service.impl;

import com.windy.windy.entity.UserInfo;
import com.windy.windy.mapper.UserInfoMapper;
import com.windy.windy.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author chulingliu
 * @since 2021-03-25
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
