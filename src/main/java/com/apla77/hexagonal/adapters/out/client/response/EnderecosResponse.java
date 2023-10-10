package com.apla77.hexagonal.adapters.out.client.response;

import lombok.Data;

@Data
public class EnderecosResponse {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;
}
