package com.apla77.hexagonal.adapters.out;

import com.apla77.hexagonal.adapters.out.repository.CustomerRepository;
import com.apla77.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.apla77.hexagonal.application.core.domain.Endereco;
import com.apla77.hexagonal.application.ports.out.InserirEnderecoOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InserirEnderecoOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void inserir(Endereco endereco) {
        var enderecoEntity = customerEntityMapper.paraEnderecoEntity(endereco);
        customerRepository.save(enderecoEntity);
    }
}
