package com.example.demo.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * create by yongli on 2020-03-23 21:50
 * swagger的配置，不太熟练
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    Docket getDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(Predicates.not(PathSelectors.regex("error.*")))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder().build();
    }
}
