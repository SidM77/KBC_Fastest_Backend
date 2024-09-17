package dev.sid.kafkapracticeone;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "sidNewTopic", groupId = "groupId")
    void listener (String data) {
        System.out.println("Listener received a contestant's answer: " + data + " 💚");
    }
}
