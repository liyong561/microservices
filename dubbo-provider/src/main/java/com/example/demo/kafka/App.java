package com.example.demo.kafka;


import org.apache.kafka.clients.admin.AdminClient;

import java.util.Properties;


/**
 * Test kafka
 * KafkaAdminClient好像又操作kafka主题相关的操作，可以看源码干了啥
 */
public class App {
    // test,Zookeeper
    public final static String URL = "127.0.0.1:9092";
    private final static String NAME = "test_topic";


    public static void main(String[] args) {

        MyKafkaProducer.send();
        new Thread(() -> MyKafkaConsumer.consumerMsg()).start();

    }
    // 创建主题
    public static AdminClient createTopic() {
        // 所有连接kafka的配置都应该写在这个property中

        Properties prop = new Properties();
        prop.setProperty("bootstrap.servers", URL);
        AdminClient adminClient = AdminClient.create(prop);
        return adminClient;
    }



}
