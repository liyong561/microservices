package com.example.zoo.config;

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

/**
 * create by yongli on 2020-04-30 22:55
 * 没有swagger访问很不方便
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // 配置swagger的模板是什么？要孰能生巧，就像做饭一样,熟练就很容易了
    /**
     * select()
     *          .apis(RequestHandlerSelectors.basePackage("com.example.springbootjpa.jpademo.controller"))
     *          .paths(PathSelectors.any())
     *          .build();
     */

    /**
     *
     * @return
     */

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.zoo"))
                .paths(PathSelectors.any())
                .build();
    }



    // 首先构造一个api info去生成Docket
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("zoo api").version("v1").
                contact(new Contact("liyong","13260338050","2869486287@qq.com")).build();
    }


}
