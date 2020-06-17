package com.example.demo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Properties;

/**
 * create by yongli on 2020-05-25 21:46
 */

public class MyKafkaConsumer {


    public static final Logger log = LoggerFactory.getLogger(MyKafkaConsumer.class);

    /**
     * 消费者的创建比producer的创建难一些
     *
     * @return
     */
    public static KafkaConsumer<String, String> consumer() {
        Properties prop = new Properties();
        prop.put("bootstrap.servers", App.URL);
        prop.put("group.id", "0");
        // deserializer
        prop.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.setProperty("enable.auto.commit", "true");
        prop.setProperty("auto.offset.reset", "earliest");

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(prop);
        return kafkaConsumer;
    }

    public static void consumerMsg() {
        KafkaConsumer<String, String> consumer = consumer();
        // 订阅主题
        consumer.subscribe(Collections.singletonList("topicDemo"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(10);
            for (ConsumerRecord<String, String> record : records) {
                log.info("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrecord:" + record);
            }
            /**
             *
             * rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrecord:ConsumerRecord(topic = topicDemo, partition = 0,
             * leaderEpoch = 0, offset = 1, CreateTime = 1590419665913, serialized key size = 6,
             * serialized value size = 11, headers = RecordHeaders(headers = [], isReadOnly = false),
             * key = key111, value = valuesss111)
             */
        }

    }
}
