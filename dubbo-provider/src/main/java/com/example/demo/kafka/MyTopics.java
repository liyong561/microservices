package com.example.demo.kafka;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.ListTopicsResult;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.admin.TopicListing;
import org.apache.kafka.common.KafkaFuture;

import java.util.Collection;
import java.util.Collections;

/**
 * create by yongli on 2020-05-25 22:01
 */

public class MyTopics {
    public static final AdminClient client = App.createTopic();

    public static void main(String[] args) {
        createTopics();
        getAllTopic();
    }

    public static void createTopics() {
        NewTopic newTopic = new NewTopic("topicDemo", 1, (short) 1);
        try {
            client.createTopics(Collections.singletonList(newTopic)).all().get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getAllTopic() {
        // 这个获取topic的方法，非常的简洁
        ListTopicsResult listTopicsResult = client.listTopics();
        KafkaFuture<Collection<TopicListing>> future = listTopicsResult.listings();
        try {
            Collection<TopicListing> list = future.get();
            for (TopicListing topicListing : list) {
                System.out.println("topic name:" + topicListing.name());
                System.out.println("topic  is internal: " + topicListing.isInternal());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
