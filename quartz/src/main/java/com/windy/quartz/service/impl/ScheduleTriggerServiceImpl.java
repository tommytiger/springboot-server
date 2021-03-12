package com.windy.quartz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.windy.quartz.entity.ScheduleTrigger;
import com.windy.quartz.dao.ScheduleTriggerMapper;
import com.windy.quartz.service.IScheduleTriggerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chulingliu
 * @since 2021-03-11
 */
@Service
public class ScheduleTriggerServiceImpl extends ServiceImpl<ScheduleTriggerMapper, ScheduleTrigger> implements IScheduleTriggerService {

}
