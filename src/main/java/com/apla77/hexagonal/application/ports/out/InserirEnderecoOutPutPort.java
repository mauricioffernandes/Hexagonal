package com.apla77.hexagonal.application.ports.out;

import com.apla77.hexagonal.application.core.domain.Endereco;

public interface InserirEnderecoOutPutPort {

    void inserir(Endereco endereco);
}
