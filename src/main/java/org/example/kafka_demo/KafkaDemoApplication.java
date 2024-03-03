package org.example.kafka_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaDemoApplication {

    public static void main(String[] args) {
            SpringApplication.run(KafkaDemoApplication.class, args);
    }
    //you can put the below method in a restful api
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String , String> kafkaTemplate){
        return args -> {
            for(int i = 0 ; i< 100 ;i++) kafkaTemplate.send("myCode" , "hello Kafka :) " + i);
        };
    }
}
