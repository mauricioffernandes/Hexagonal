package com.apla77.hexagonal.application.ports.out;

import com.apla77.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
