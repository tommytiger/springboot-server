package com.windy.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.windy.user.dao.UserExtendsMapper;
import com.windy.user.entity.UserExtends;
import com.windy.user.service.IUserExtendsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户扩展表 服务实现类
 * </p>
 *
 * @author chulingliu
 * @since 2021-03-25
 */
@Service
public class UserExtendsServiceImpl extends ServiceImpl<UserExtendsMapper, UserExtends> implements IUserExtendsService {

}
