package com.zdz.db.datasource.interceptor.ints;

/**
 * @author zhangdezhi
 * @date 2020-03-19
 */
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import java.util.Properties;

/**
 * <pre>
 *  Mybatis SQL拦截器
 */
@Component
@Intercepts(@Signature(type = Executor.class, method = "query",
        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}))
public class MybatisSqlInterceptor implements Interceptor {

    Logger  LOGGER = LoggerFactory.getLogger(MybatisSqlInterceptor.class);
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 拦截sql
        Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        Object parameterObject = args[1];
        BoundSql boundSql = statement.getBoundSql(parameterObject);
        String sql = boundSql.getSql();
        LOGGER.info("获取到的SQL：{}"+sql);
        if (StringUtils.isBlank(sql)) {
            return invocation.proceed();
        }
        // 返回
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object obj) {
        return Plugin.wrap(obj, this);
    }

    @Override
    public void setProperties(Properties arg0) {}

}
