package com.acme.application;

import com.acme.domain.*;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        FuncionarioService funcionarioService = new FuncionarioService();

        FuncionarioACME funcionario1 = new FuncionarioACME(
                "João Silva", Arrays.asList("123456789", "987654321"), "Rua A, 123",
                3000.0, Setor.DEVOPS, Cargo.JUNIOR);

        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado(
                "Marcelo Reis", Arrays.asList("123454325", "987654251"), "Rua A, 123", 3000.00,
                Setor.DESENVOLVIMENTO, Cargo.SENIOR, "Empresa XYZ", 12);

        funcionarioService.adicionarFuncionario(funcionario1);
        funcionarioService.adicionarFuncionario(funcionarioTerceirizado);

        System.out.println("=====================================");
        System.out.println("Listando Funcionários:");
        System.out.println("=====================================");
        funcionarioService.listarFuncionarios();
        System.out.println("=====================================\n");

        System.out.println("=====================================");
        System.out.println("Salário de " + funcionario1.getNome() + ": " + funcionario1.getSalario());
        funcionario1.reajustarSalario(10);
        System.out.println("Salário Ajustado: " + funcionario1.getSalario());
        System.out.println("=====================================\n");

        System.out.println("=====================================");
        System.out.println("Informações dos Funcionários:");
        System.out.println("=====================================");
        System.out.println(funcionario1);
        System.out.println(funcionarioTerceirizado);
        System.out.println("=====================================");
    }
}
