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
@MapperScan(value = "cn.sang.dao2", sqlSessionFactoryRef = "sqlSessionFactoryBeanTwo")
public class MyBatisConfigTwo {

    @Autowired
    @Qualifier("dsTwo")
    DataSource dsTwo;

    @Bean
    @Primary
    SqlSessionFactory sqlSessionFactoryBeanOne() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dsTwo);
        return factoryBean.getObject();
    }

    @Bean
    @Primary
    SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactoryBeanOne());
    }
}
