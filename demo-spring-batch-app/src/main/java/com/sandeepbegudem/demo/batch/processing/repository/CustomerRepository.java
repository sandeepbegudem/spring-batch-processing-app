package com.sandeepbegudem.demo.batch.processing.repository;

import com.sandeepbegudem.demo.batch.processing.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
