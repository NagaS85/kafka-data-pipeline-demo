package com.kafka.data.pipeline.demo.service;

import com.kafka.data.pipeline.demo.model.RequestObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProduceService {
    @Value(value = "${input.topic}")
    private String inputTopic;

    private final KafkaTemplate kafkaTemplate;

    public ProduceService(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate=kafkaTemplate;
    }

    public void produceEvent(RequestObject requestObject){
        kafkaTemplate.send(inputTopic,requestObject.getRequest());
    }
}
