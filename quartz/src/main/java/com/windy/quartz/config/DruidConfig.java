package com.windy.quartz.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.quartz.SchedulerException;
import org.quartz.utils.ConnectionProvider;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * {Druid连接池的Quartz扩展类}
 * @author liuch
 * @date 2021/3/9
 * @version v1.0
 */
public class DruidConfig implements ConnectionProvider {
    //JDBC驱动
    private String driver;

    private String url;

    private String user;

    private String password;

    //最大连接数
    private int maxConnection;

    //数据库sql查询每次连接返回执行到连接池,以确保它仍然是有效的
    private String validationQuery;

    private boolean validateOnCheckout;

    private int idleConnectionValidationSeconds;

    private String maxCachedStatementsPerConnection;

    private String discardIdleConnectionsSeconds;

    private static final int DEFAULT_DB_MAX_CONNECTIONS = 10;

    private static final int DEFAULT_DB_MAX_CACHED_STATEMENTS_PER_CONNECTION = 120;
    //Druid连接池
    private DruidDataSource dataSource;

    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public void shutdown() throws SQLException {
        dataSource.close();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxConnection() {
        return maxConnection;
    }

    public void setMaxConnection(int maxConnection) {
        this.maxConnection = maxConnection;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isValidateOnCheckout() {
        return validateOnCheckout;
    }

    public void setValidateOnCheckout(boolean validateOnCheckout) {
        this.validateOnCheckout = validateOnCheckout;
    }

    public int getIdleConnectionValidationSeconds() {
        return idleConnectionValidationSeconds;
    }

    public void setIdleConnectionValidationSeconds(int idleConnectionValidationSeconds) {
        this.idleConnectionValidationSeconds = idleConnectionValidationSeconds;
    }

    public String getMaxCachedStatementsPerConnection() {
        return maxCachedStatementsPerConnection;
    }

    public void setMaxCachedStatementsPerConnection(String maxCachedStatementsPerConnection) {
        this.maxCachedStatementsPerConnection = maxCachedStatementsPerConnection;
    }

    public String getDiscardIdleConnectionsSeconds() {
        return discardIdleConnectionsSeconds;
    }

    public void setDiscardIdleConnectionsSeconds(String discardIdleConnectionsSeconds) {
        this.discardIdleConnectionsSeconds = discardIdleConnectionsSeconds;
    }

    public static int getDefaultDbMaxConnections() {
        return DEFAULT_DB_MAX_CONNECTIONS;
    }

    public static int getDefaultDbMaxCachedStatementsPerConnection() {
        return DEFAULT_DB_MAX_CACHED_STATEMENTS_PER_CONNECTION;
    }

    public DruidDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DruidDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void initialize() throws SQLException {
        if (this.url == null){
            throw new SQLException("数据库创建异常,url不存在");
        }
        if (this.driver == null){
            throw new SQLException("数据库创建异常,驱动类型为空");
        }
        if (maxConnection < 0){
            throw new SQLException("数据库创建异常,最大连接数小于0");
        }
        dataSource = new DruidDataSource();
        try{
            dataSource.setDriverClassName(this.driver);
            dataSource.setUrl(url);
            dataSource.setUsername(user);
            dataSource.setPassword(password);
            dataSource.setMaxActive(maxConnection);
            dataSource.setMinIdle(1);
            dataSource.setMaxWait(0);
            dataSource.setMaxPoolPreparedStatementPerConnectionSize(DEFAULT_DB_MAX_CACHED_STATEMENTS_PER_CONNECTION);
            if (this.validationQuery !=null){
                dataSource.setValidationQuery(validationQuery);
                if (!this.validateOnCheckout){
                    dataSource.setTestOnReturn(true);
                }else {
                    dataSource.setTestOnBorrow(true);
                }
                dataSource.setValidationQueryTimeout(idleConnectionValidationSeconds);
            }
        }catch (Exception e){
            try{
                throw new SchedulerException("设置数据源驱动类型异常:" + e.getMessage(),e);
            }catch (SchedulerException e1){

            }
        }




    }
}
