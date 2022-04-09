package com.example.edaconsumer.service;

import com.eda.example.eda.event.CustomerCreatedEvent;
import com.eda.example.eda.event.Event;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CostumerEventService {


    @KafkaListener(
        topics = "${topic.customer.name:customers}",
        containerFactory = "kafkaListenerContainerFactory",
        groupId = "grupo1")
    public void consumer(Event<?> event){
        if(event.getClass().isAssignableFrom(CustomerCreatedEvent.class)){
            CustomerCreatedEvent customerCreatedEvent=(CustomerCreatedEvent) event;
            log.info("Received customer created event... with id={}, data={}",
                customerCreatedEvent.getId(),customerCreatedEvent.getData());
            
        }
    }

}
