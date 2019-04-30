package com.example.msv.configuration;

import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 标记接口，可理解为初始化时生成bean
 * 还需要禁用一下spring的security
 */

@EnableSwagger2
@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
    /**
     *
     * @return  切记一定要生成自己的bean3
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())  // 监控和显示
                .build();

    }
    public ApiInfo apiInfo(){
        /**
         * Builder将参数写在方法中,很方便
         */
        return new ApiInfoBuilder()
                .title("swagger测试的头文件")
                .description("there is no description")
                .termsOfServiceUrl("http://localhost:8888")
                .version("1.0")
                .build();
    }

}
