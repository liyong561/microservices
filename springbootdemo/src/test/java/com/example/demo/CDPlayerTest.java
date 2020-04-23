package com.example.demo;

import com.example.demo.player.CDPlayerConfig;
import com.example.demo.player.CompactDisc;
import com.example.demo.player.CompactDisc2;
import com.example.demo.player.SignInterface;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 简单的spring测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
 //ContextConfiguration注解也不能丢。
public class CDPlayerTest {
    @Autowired
    CompactDisc2 compactDisc;  //还差一个@Configuration，学习常见注解的作用

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(compactDisc);
    }
}
