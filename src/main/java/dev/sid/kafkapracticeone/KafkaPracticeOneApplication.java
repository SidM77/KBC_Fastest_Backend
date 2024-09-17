package dev.sid.kafkapracticeone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaPracticeOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaPracticeOneApplication.class, args);
    }


//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
//        return args -> {
//
//            for (int i = 1; i < 100; i++) {
//                kafkaTemplate.send("sidNewTopic", "hello kafka message number " + i);
//            }
//        };
//    }

}
