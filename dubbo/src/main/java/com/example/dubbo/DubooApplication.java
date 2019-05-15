package com.example.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DubooApplication {

	public static void main(String[] args) {
		// there is a context,and many differences;
	    SpringApplication.run(DubooApplication.class, args);
	}

}
