package com.apla77.hexagonal.adapters.in.controller.mapper;

import com.apla77.hexagonal.adapters.in.controller.request.EnderecoRequest;
import com.apla77.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.apla77.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "addEndereco", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer paraEnderecoRequest(EnderecoRequest enderecoRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
