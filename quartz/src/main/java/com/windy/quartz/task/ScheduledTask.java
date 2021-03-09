package com.windy.quartz.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledTask extends QuartzJobBean {
    private final static Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //定时调度任务逻辑
        log.info("------>天青色的烟雨<-------" + new Date());
    }
}
