package com.example.demo;

import com.example.demo.entity.World;
import com.example.demo.redis.RedisTemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * 写一些测试代码，不能老是使用swagger测试
 * 一个合格的程序员应该会写测下代码
 * SpringBootTest就是启动那个类的意思
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboApplication.class)
public class DubboApplicationTests {

    @Autowired
    RedisTemplateService redisService;

    @Test
    public void contextLoads() {
        World world = new World("liyong8989", 12, new Date());
        // 测试的不会对数据库产生影响吗？
        redisService.setValue("name3", world);
        Object obj = redisService.getValue("name3");
        World world1 = (World) obj;
        System.out.println("test:" + world1.getAge());
    }

}
