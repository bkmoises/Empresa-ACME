package com.acme.domain;

public interface EnderecoFactory {
    Endereco criarEndereco(String rua, String numero, String cidade, String estado, String cep);
}