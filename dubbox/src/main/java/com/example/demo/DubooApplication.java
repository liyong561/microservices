package com.example.demo;

import com.example.demo.redis.AnnotationService;
import com.example.demo.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  本地生成的是一个代理对象，不是真的对象。
 */
@SpringBootApplication
public class DubooApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubooApplication.class, args);
		AnnotationService annotationService = SpringUtil.getBean(AnnotationService.class);
		String name = annotationService.sayHello("ddd");
		System.out.println(name);
	}

}
