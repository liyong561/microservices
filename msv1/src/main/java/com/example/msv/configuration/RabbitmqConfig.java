package com.example.msv.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create the queue and other confug
 */
@Configuration
public class RabbitmqConfig {
    @Bean
    public Queue queue1(){
        return new Queue("hello.queue1", true);
    }
    @Bean
    public Queue queue2(){
        return new Queue("hello.queue2",true);
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange");
    }
    @Bean
    public Binding binding1(){
        // ths is call binding key,the exchange send message to queue  according to the binding key
        return BindingBuilder.bind(queue1()).to(topicExchange()).with("key.1");
    }
    @Bean
    public Binding binding2(){
        return BindingBuilder.bind(queue2()).to(topicExchange()).with("key.2");
    }

}
