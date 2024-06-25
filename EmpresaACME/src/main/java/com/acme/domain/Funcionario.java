package com.acme.domain;

import java.util.List;

public class Funcionario {
    private String nome;
    private List<String> telefones;
    private Endereco endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;

    Funcionario(Builder builder) {
        this.nome = builder.nome;
        this.telefones = builder.telefones;
        this.endereco = builder.endereco;
        this.salario = builder.salario;
        this.setor = builder.setor;
        this.cargo = builder.cargo;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public static class Builder<T extends Builder<T>> {
        private String nome;
        private List<String> telefones;
        private Endereco endereco;
        private double salario;
        private Setor setor;
        private Cargo cargo;

        public T setNome(String nome) {
            this.nome = nome;
            return self();
        }

        public T setTelefones(List<String> telefones) {
            this.telefones = telefones;
            return self();
        }

        public T setEndereco(Endereco endereco) {
            this.endereco = endereco;
            return self();
        }

        public T setSalario(double salario) {
            this.salario = salario;
            return self();
        }

        public T setSetor(Setor setor) {
            this.setor = setor;
            return self();
        }

        public T setCargo(Cargo cargo) {
            this.cargo = cargo;
            return self();
        }

        protected T self() {
            return (T) this;
        }

        public Funcionario build() {
            return new Funcionario(this);
        }
    }

}
