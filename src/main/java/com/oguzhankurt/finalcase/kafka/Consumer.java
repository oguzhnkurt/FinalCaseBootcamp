package com.oguzhankurt.finalcase.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Consumer {

    @KafkaListener(
            topics = "test",
            groupId = "test-group"
    )
    public void consumeInfo(String message) {
        log.info(message);
    }
}