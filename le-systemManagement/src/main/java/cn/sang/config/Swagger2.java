package cn.sang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage ("cn.sang.controller"))
                .paths(PathSelectors. any() )
                .build();
    }
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                // 自定义信息可按需求填写
                .title("测试项目 RESTful APIs")
                .description("后台测试接口-用户管理模块")
                .version("1.0")
                .build();
    }
}