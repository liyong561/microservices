package com.example.demo.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 通过这个对象获取配置的信息
 */
@Component
public class ConfigService {
    // 这个注解的作用应该是先去本地配置文件中找，本地配置文件告诉它去另一个服务中找，
    /**
     * https://github.com/liyong561/algorithm//config-file/myService.yml'}]},在bootstrap中，自动合成了该路径。
     * 直接使用云存储中的8090做为端口
     */
    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private String port;

    public String getName(){
        return name;
    }

    // 是不是使用时直接从远程获取，保证更新时不用重新部署
    public String getPort() { return port;}
}
