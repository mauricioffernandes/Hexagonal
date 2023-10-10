package com.apla77.hexagonal.application.ports.out;

import com.apla77.hexagonal.application.core.domain.Endereco;

public interface FindEnderecoPorCepOutputPort {
    Endereco find(String numeroCep);
}
