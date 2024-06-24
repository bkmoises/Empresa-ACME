package com.acme.domain;

import java.util.List;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, List<String> telefones, String endereco,
                                   double salario, Setor setor, Cargo cargo,
                                   String empresaContratada, int tempoPrevistoPermanencia) {
        super(nome, telefones, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    public int getTempoPrevistoPermanencia() {
        return tempoPrevistoPermanencia;
    }

    public void setTempoPrevistoPermanencia(int tempoPrevistoPermanencia) {
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }
}
