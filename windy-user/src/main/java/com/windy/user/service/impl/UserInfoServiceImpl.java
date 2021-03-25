package com.windy.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.windy.user.dao.UserInfoMapper;
import com.windy.user.entity.UserInfo;
import com.windy.user.service.IUserInfoService;
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
