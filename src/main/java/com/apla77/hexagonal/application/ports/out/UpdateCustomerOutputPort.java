package com.apla77.hexagonal.application.ports.out;

import com.apla77.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
