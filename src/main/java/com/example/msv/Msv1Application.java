package com.example.msv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Msv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Msv1Application.class, args);
	}

}
