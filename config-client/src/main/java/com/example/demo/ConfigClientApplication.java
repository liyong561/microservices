package com.example.demo;

import com.example.demo.network.ServerSocketTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 有关于Eureka的基本认识
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigClientApplication {
    /**
    每个微服务可能会运行多个服务实例，就像是类和对象的关系，这时需要不同的配置信息，这就是config server的一个应用场景。
    配置client从通常的意义看，也知识调用了server的服务，那么，怎么让其他的服务在运行之前都从配置中心拉取文件呢？
    该服务使用了config-server中的配置文件，即是对config应用产生了依赖。
     FactoryBean有一个泛型接口，getObject(),就是说这个接口能够产生继承了这个接口的Bean
     BeanFactory则管理了很多类，可以返回各种对象。
     */


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);

    }

}

