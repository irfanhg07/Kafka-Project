package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public NewTopic topic() {
        return TopicBuilder
                .name("location-update-topic")
                .partitions(10)
                .replicas(1)
                .build();
    }

}
