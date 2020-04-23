package com.example.demo.player;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class CDPlayerConfig {
    @Bean
    public CompactDisc2 compactDisc2(Bottle bottle) {
        return new CompactDisc2(bottle);
    }
}