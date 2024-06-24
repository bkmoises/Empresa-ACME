package com.acme.domain;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    private List<Funcionario> funcionarios;

    public FuncionarioService() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }
}


