package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * exclude配置为先不启用DataSource
 * 这个注解在该包下：org.springframework.boot.autoconfigure;、
 * @ MapperScan("com.example.demo.mapper*") 按照mybatis的目录规范，是需要配置扫描文件的。
 * @Bean 会使用这个注解，基本就会了spring的大部分
 */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
          // Run方法返回的就是这样一个方法。
		ConfigurableApplicationContext context =SpringApplication.run(DemoApplication.class, args);
	}
}

