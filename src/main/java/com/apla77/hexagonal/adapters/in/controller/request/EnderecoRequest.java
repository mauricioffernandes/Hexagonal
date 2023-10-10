package com.apla77.hexagonal.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EnderecoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;
    @NotBlank
    private String cep;

}
