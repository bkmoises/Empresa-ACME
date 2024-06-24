package com.acme.application;

import com.acme.domain.Funcionario;
import com.acme.domain.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João Silva", new ArrayList<>(Arrays.asList("123456789", "987654321")), "Rua A, 123", 3000.0, 2, 3);

        FuncionarioTerceirizado funcionario2 = new FuncionarioTerceirizado(
                "Maria Souza",
                Arrays.asList("123456987", "987654123"),
                "Rua B, 456",
                4000.00,
                0,
                2,
                "Empresa XYZ",
                10
        );
        Funcionario.adicionarFuncionario(funcionario1);
        Funcionario.adicionarFuncionario(funcionario2);


        System.out.println("======================");
        System.out.println("Listando Funcionários:");
        System.out.println("======================");
        Funcionario.listarFuncionarios();
        System.out.println("======================\n");

        System.out.println("======================");
        System.out.println("Funcionario 1:");
        System.out.println("======================");
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Setor: " + funcionario1.getSetor());
        System.out.println("======================\n");

        System.out.println("======================");
        System.out.println("Funcionario 2:");
        System.out.println("======================");
        System.out.println("Cargo: " + funcionario2.getCargo());
        System.out.println("Setor: " + funcionario2.getSetor());
        System.out.println("======================\n");

        System.out.println("======================");
        System.out.println("Salário: " + funcionario1.getSalario());
        funcionario1.reajustarSalario(10);
        System.out.println("Salário Ajustado: " + funcionario1.getSalario());
        System.out.println("======================\n");

        funcionario2.reajustarSalario(10);

    }
}
