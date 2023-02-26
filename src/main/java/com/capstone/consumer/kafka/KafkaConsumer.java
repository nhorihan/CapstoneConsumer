package com.capstone.consumer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class KafkaConsumer {
    Logger logger = Logger.getLogger(String.valueOf(KafkaConsumer.class));
    @KafkaListener(id = "kafkaConsumerExampleId", topics="TutorialTopic")
    public void listen(String data) {
        //displayMessageClient.displayMessage(data);
        logger.info("Received data: " + data);

    }
}
