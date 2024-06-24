package com.acme.domain;

import java.util.List;

public class FuncionarioACME extends Funcionario {

    public FuncionarioACME(String nome, List<String> telefones, String endereco,
                           double salario, Setor setor, Cargo cargo) {
        super(nome, telefones, endereco, salario, setor, cargo);
    }

    public void reajustarSalario(double aumentoPercentual) {
        double salarioAtual = getSalario();
        double aumento = salarioAtual * (aumentoPercentual / 100);
        setSalario(salarioAtual + aumento);
    }
}
