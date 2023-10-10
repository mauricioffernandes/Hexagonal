package com.apla77.hexagonal.application.core.usecase;

import com.apla77.hexagonal.application.core.domain.Customer;
import com.apla77.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.apla77.hexagonal.application.ports.out.FindEnderecoPorCepOutputPort;
import com.apla77.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindEnderecoPorCepOutputPort findEnderecoPorCepOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindEnderecoPorCepOutputPort findEnderecoPorCepOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort
    ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findEnderecoPorCepOutputPort = findEnderecoPorCepOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    public void update(Customer customer, String cep){
        findCustomerByIdInputPort.find(customer.getId());
        var endereco = findEnderecoPorCepOutputPort.find(cep);
        customer.setAddEndereco(endereco);
        updateCustomerOutputPort.update(customer);
    }
}
