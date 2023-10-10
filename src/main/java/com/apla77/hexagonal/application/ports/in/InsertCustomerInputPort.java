package com.apla77.hexagonal.application.ports.in;

import com.apla77.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String cep);
}
