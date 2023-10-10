package com.apla77.hexagonal.application.core.domain;

public class Customer {
    private String id;
    private String nome;
    private Endereco addEndereco;
    private String cpf;
    private Boolean isValidCpf;

    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(String id, String nome, Endereco addEndereco, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.nome = nome;
        this.addEndereco = addEndereco;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getAddEndereco() {
        return addEndereco;
    }

    public void setAddEndereco(Endereco addEndereco) {
        this.addEndereco = addEndereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
