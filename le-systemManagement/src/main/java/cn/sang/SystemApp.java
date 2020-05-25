package cn.sang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"cn.sang.*"})
@SpringBootApplication
public class SystemApp {
    public static void main(String[] args){
        SpringApplication.run(SystemApp.class,args);
    }
}
