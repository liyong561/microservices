package com.example.demo.concert;

import com.example.demo.player.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *在测试时，performance的注入出现了问题。
 * 问题在于@Compnent其实也需要spring发现，当然springboot是不需要的。
 */
@RunWith(SpringJUnit4ClassRunner.class)

public class ConcertTest {
    @Autowired
    PerformanceImpl performance;
    @Test
    public void info(){
        performance.perform();
    }
}
