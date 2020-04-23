package com.example.chengduservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * create by yongli on 2019-09-14 17:37
 * 访问swagger时也需要一个swagger-ui.html的地址，这个是最好的面向对象编程的例子
 * @ Configuration, 加载该配置类
 * 核心是一个Docket，摘要
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)  // 有swagger页面，但是什么东西都看不见
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.chengduservice"))
                .build();
    }

    // 作为基本信息展示在url中
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("设置apiInfo的title")
                .description("不知道怎么描述")
                .termsOfServiceUrl("http://aliyun.com")
                .version("v1")
                .build();  // 这些个静态方法真长
    }
    public void test(){
        String name = Singleton.getName();


    }
}
