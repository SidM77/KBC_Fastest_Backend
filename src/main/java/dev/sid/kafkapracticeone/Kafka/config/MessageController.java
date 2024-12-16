package dev.sid.kafkapracticeone.Kafka.config;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class MessageController {

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/")
    public String test () {
        return "Hello World!";
    }

    @PostMapping("api/v1/messages")
    public void publish (@RequestBody MessageRequest messageRequest) {
        kafkaTemplate.send("sidSecondTopic", messageRequest.message());
    }
}
