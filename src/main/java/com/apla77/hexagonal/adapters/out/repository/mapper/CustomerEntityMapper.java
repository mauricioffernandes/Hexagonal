package com.apla77.hexagonal.adapters.out.repository.mapper;

import com.apla77.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.apla77.hexagonal.application.core.domain.Customer;
import com.apla77.hexagonal.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Endereco endereco);

    Customer toCustomer(CustomerEntity customerEntity);
}
