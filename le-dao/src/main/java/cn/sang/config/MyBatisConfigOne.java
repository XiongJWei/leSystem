package cn.sang.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "cn.sang.dao1", sqlSessionFactoryRef = "sqlSessionFactoryBeanOne")
public class MyBatisConfigOne {

    @Autowired
    @Qualifier("dsOne")
    DataSource dsOne;

    @Bean
    @Primary
    SqlSessionFactory sqlSessionFactoryBeanOne() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dsOne);
        return factoryBean.getObject();
    }

    @Bean
    @Primary
    SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactoryBeanOne());
    }
}
