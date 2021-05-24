package com.brillio.customerMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brillio.customerMS.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
