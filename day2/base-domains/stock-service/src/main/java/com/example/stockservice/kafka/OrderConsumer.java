package com.example.stockservice.kafka;

import com.example.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "stock"
    )

    public void consume(OrderEvent event){
        LOGGER.info(String.format("Order event received in stock services => %s", event.toString()));
        System.out.println("here");
    }
}
