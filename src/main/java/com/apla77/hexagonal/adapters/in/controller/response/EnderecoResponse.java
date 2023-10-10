package com.apla77.hexagonal.adapters.in.controller.response;

import lombok.Data;

@Data
public class EnderecoResponse {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;
}
