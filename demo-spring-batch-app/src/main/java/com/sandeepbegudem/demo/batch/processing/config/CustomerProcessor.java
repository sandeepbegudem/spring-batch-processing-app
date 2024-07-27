package com.sandeepbegudem.demo.batch.processing.config;

import com.sandeepbegudem.demo.batch.processing.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
