package com.eda.example.eda.event;

import com.example.edaconsumer.entity.Customer;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper =true)
public class CustomerCreatedEvent extends Event<Customer> {
}

