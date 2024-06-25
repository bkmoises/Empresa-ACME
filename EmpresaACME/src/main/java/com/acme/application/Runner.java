package com.acme.application;

import com.acme.domain.*;
import com.acme.service.FuncionarioService;
import com.acme.service.IRhService;
import com.acme.service.RhService;
import com.acme.service.RhServiceProxy;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        FuncionarioService funcionarioService = new FuncionarioService();
        EnderecoFactory enderecoFactory = new EnderecoFactoryImpl();

        IRhService rhService = new RhService();
        IRhService proxyService = new RhServiceProxy(rhService, true);

        Endereco enderecoFuncionario = enderecoFactory.criarEndereco("Av. Paulista", "2234", "São Paulo", "SP", "12345-321");
        FuncionarioACME funcionario = new FuncionarioACME.Builder()
                .setNome("João")
                .setTelefones(Arrays.asList("123456789", "987654321"))
                .setEndereco(enderecoFuncionario)
                .setSalario(5000)
                .setSetor(Setor.DESENVOLVIMENTO)
                .setCargo(Cargo.PLENO)
                .build();

        Endereco enderecoFuncionarioTerceirizado = enderecoFactory.criarEndereco("Rua Íris França", "331", "Teresina", "PI", "64032-230");
        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado.Builder()
                .setNome("Carlos")
                .setTelefones(Arrays.asList("123456789", "987654321"))
                .setEndereco(enderecoFuncionarioTerceirizado)
                .setSalario(4000.00)
                .setSetor(Setor.DEVOPS)
                .setCargo(Cargo.JUNIOR)
                .setEmpresaContratada("Empresa XYZ")
                .build();

        System.out.println("-------------------------");
        System.out.println("Funcionário: " + funcionario.getNome() + " Salário: " + funcionario.getSalario());
        System.out.println("Funcionário: " + funcionarioTerceirizado.getNome() + " Salário: " + funcionarioTerceirizado.getSalario());
        System.out.println("-------------------------\n");

        System.out.println("-------------------------");
        proxyService.promover(funcionario);
        proxyService.aplicarReajuste(funcionario);
        System.out.println("-------------------------\n");

        System.out.println("-------------------------");
        System.out.println(funcionarioTerceirizado.getEndereco());
        System.out.println(funcionario.getEndereco());
        System.out.println("-------------------------\n");

        funcionarioService.adicionarFuncionario(funcionario);
        funcionarioService.adicionarFuncionario(funcionarioTerceirizado);

        System.out.println("-------------------------");
        System.out.println("-      Funcionarios     -");
        System.out.println("-------------------------");
        funcionarioService.listarFuncionarios()
                .stream()
                .forEach(func -> {
                    System.out.println(func.getNome());
                });
        System.out.println("-------------------------");
    }
}
