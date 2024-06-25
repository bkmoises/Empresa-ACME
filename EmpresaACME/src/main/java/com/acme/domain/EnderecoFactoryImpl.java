package com.acme.domain;

public class EnderecoFactoryImpl implements EnderecoFactory {
    @Override
    public Endereco criarEndereco(String rua, String numero, String cidade, String estado, String cep) {
        return new Endereco(rua, numero, cidade, estado, cep);
    }
}
