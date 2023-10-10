package com.apla77.hexagonal.adapters.out.repository.entity;

import lombok.Data;

@Data
public class EnderecoEntity {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;
}
