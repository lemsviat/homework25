package com.lemsviat.springboot.homework25.dao;

import com.lemsviat.springboot.homework25.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
}
