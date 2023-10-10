package com.apla77.hexagonal.adapters.out.repository.entity;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private Long id;
    private String nome;
    private EnderecoEntity addEndereco;
    private String cpf;
    private Boolean isValidCpf;
}
