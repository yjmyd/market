package com.sell.market.config;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * 新marketdb数据源配置
 *
 * @author Requiem
 * @version 1.0
 * @date 2017/11/10
 */
@Configuration
@MapperScan(basePackages = "com.sell.market.mapper", sqlSessionTemplateRef = "marketdbSqlSessionTemplate")
public class MarketDataSourceConfig {

    @Bean(name = "marketDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.marketdb")
    public DataSource marketDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "marketdbSqlSessionFactory")
    public SqlSessionFactory marketdbSqlSessionFactory(@Qualifier("marketDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "marketdbSqlSessionTemplate")
    public SqlSessionTemplate marketdbSqlSessionTemplate(@Qualifier("marketdbSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "marketdbTransactionManager")
    public DataSourceTransactionManager marketdbTransactionManager()
            throws SQLException {
        return new DataSourceTransactionManager(marketDataSource());
    }
}
