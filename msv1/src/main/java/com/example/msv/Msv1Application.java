package com.example.msv;

import com.example.msv.utils.BeanCountUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Msv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Msv1Application.class, args);
		BeanCountUtil.printAllBeanName();

	}
}
