package com.apla77.hexagonal.application.ports.in;

import com.apla77.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
