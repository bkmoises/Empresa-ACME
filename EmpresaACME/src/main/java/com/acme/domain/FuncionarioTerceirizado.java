package com.acme.domain;

import java.util.List;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratada;

    public FuncionarioTerceirizado(String nome, List<String> telefones, String endereco, double salario, int codigoSetor, int codigoCargo, String empresaContratada) {
        super(nome, telefones, endereco, salario, codigoSetor, codigoCargo);
        this.empresaContratada = empresaContratada;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    @Override
    public void reajustarSalario(double aumentoPercentual) {
        System.out.println("Funcionário terceirizado não é elegível para reajuste salarial.");
    }
}