package com.example.demo.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * create by yongli on 2020-05-25 21:45
 */

public class MyKafkaProducer {


    public static KafkaProducer<String,String> producer(){
        Properties prop =new Properties();
        prop.put("bootstrap.servers",App.URL);
        prop.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        prop.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String,String> kafkaProducer = new KafkaProducer<>(prop);
        return kafkaProducer;
    }

    public static  void  send(){
        KafkaProducer<String,String> producer = producer();
        ProducerRecord<String,String> record =
                new ProducerRecord<>("topicDemo","key111","valuesss111");
        producer.send(record);


    }
}
