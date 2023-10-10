package com.apla77.hexagonal.application.core.usecase;

import com.apla77.hexagonal.application.core.domain.Customer;
import com.apla77.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.apla77.hexagonal.application.ports.out.FindEnderecoPorCepOutputPort;
import com.apla77.hexagonal.application.ports.out.InserirEnderecoOutPutPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindEnderecoPorCepOutputPort buscarEnderecoPorNumeroCepOutputPort;
    private final InserirEnderecoOutPutPort inserirEnderecoOutPutPort;

    public InsertCustomerUseCase(
            FindEnderecoPorCepOutputPort buscarEnderecoPorNumeroCepOutputPort,
            InserirEnderecoOutPutPort inserirEnderecoOutPutPort
    ) {
        this.buscarEnderecoPorNumeroCepOutputPort = buscarEnderecoPorNumeroCepOutputPort;
        this.inserirEnderecoOutPutPort = inserirEnderecoOutPutPort;
    }

    @Override
    public void insert(Customer customer, String cep){
        var endereco = buscarEnderecoPorNumeroCepOutputPort.buscar(cep);
        customer.setAddEndereco(endereco);
        inserirEnderecoOutPutPort.inserir(endereco);
    }
}
