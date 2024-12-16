package dev.sid.kafkapracticeone.Kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "sidSecondTopic", groupId = "groupId")
    void listener (String data) {
        String ans = data.substring(0, 4);
        String correctAns = "dbca";
        if (ans.equalsIgnoreCase(correctAns)) {
            System.out.println("✅ Correct Answer " + data);
        } else {
            System.out.println("❌ Wrong   Answer " + data);
        }
    }
}
