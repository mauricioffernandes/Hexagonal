package com.apla77.hexagonal.adapters.in.controller.response;

import lombok.Data;

@Data
public class CustomerResponse {
    private String nome;
    private EnderecoResponse addEndereco;
    private String cpf;
    private Boolean isValidCpf;


}
