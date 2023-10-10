package com.apla77.hexagonal.adapters.out;

import com.apla77.hexagonal.adapters.out.client.ConsultaEnderecoPorCep;
import com.apla77.hexagonal.adapters.out.client.mapper.EnderecoResponseMapper;
import com.apla77.hexagonal.application.core.domain.Endereco;
import com.apla77.hexagonal.application.ports.out.FindEnderecoPorCepOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindEnderecoPorCepAdapter implements FindEnderecoPorCepOutputPort {

    @Autowired
    private ConsultaEnderecoPorCep consultaEnderecoPorCep;

    @Autowired
    private EnderecoResponseMapper enderecoResponseMapper;
    @Override
    public Endereco buscar(String numeroCep) {
        var enderecoResponse = consultaEnderecoPorCep.find(numeroCep);
        return enderecoResponseMapper.paraEndereco(enderecoResponse);
    }
}
