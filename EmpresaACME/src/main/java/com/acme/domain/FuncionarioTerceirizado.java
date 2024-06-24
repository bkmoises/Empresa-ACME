package com.acme.domain;

import java.util.List;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratada;
    private int tempoPermanencia;

    public FuncionarioTerceirizado(String nome, List<String> telefones, String endereco, double salario, int codigoSetor, int codigoCargo, String empresaContratada, int tempoPermanencia) {
        super(nome, telefones, endereco, salario, codigoSetor, codigoCargo);
        this.empresaContratada = empresaContratada;
        this.tempoPermanencia = tempoPermanencia;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    public int getTempoPermanencia() {
        return tempoPermanencia;
    }

    public void setTempoPermanencia(int tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }

    @Override
    public void reajustarSalario(double aumentoPercentual) {
        System.out.println("Funcionário terceirizado não é elegível para reajuste salarial.");
    }
}
