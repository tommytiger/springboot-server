package com.windy.quartz.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.quartz.SchedulerException;
import org.quartz.utils.ConnectionProvider;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * {Druid连接池的Quartz扩展类}
 * @author liuch
 * @date 2021/3/9
 * @version v1.0
 */
public class DruidConnectionProvider implements ConnectionProvider, ApplicationContextAware {

    //Druid连接池
    private DruidDataSource dataSource;

    private static ApplicationContext applicationContext;

    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public void shutdown() throws SQLException {
        dataSource.close();
    }

    @Override
    public void initialize() throws SQLException {
        dataSource = (DruidDataSource) applicationContext.getBean(DataSource.class);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        DruidConnectionProvider.applicationContext = applicationContext;
    }
}
