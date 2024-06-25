package com.acme.service;

import com.acme.domain.Cargo;
import com.acme.domain.Funcionario;
import com.acme.domain.FuncionarioACME;


public class RhService implements IRhService {
    static double percentualDeReajuste;

    public FuncionarioACME aplicarReajuste(Funcionario funcionario) {
        if (funcionario instanceof FuncionarioACME) {
            FuncionarioACME funcionarioACME = (FuncionarioACME) funcionario;

            switch (funcionario.getCargo()) {
                case ESTAGIARIO -> percentualDeReajuste = 2;
                case JUNIOR -> percentualDeReajuste = 5;
                case PLENO -> percentualDeReajuste = 10;
                case SENIOR -> percentualDeReajuste = 20;
            }

            double novoSalario = funcionario.getSalario() * (1 + percentualDeReajuste / 100);

            FuncionarioACME funcionarioAtualizado = funcionarioACME.salarioReajustado(novoSalario);
            System.out.println("Reajuste aplicado para " + funcionarioAtualizado.getNome() + ". Novo salário: " + funcionarioAtualizado.getSalario());
            return funcionarioAtualizado;
        } else {
            System.out.println("Funcionário terceirizado " + funcionario.getNome() + " não é elegível para reajuste.");
            return null;
        }
    }

    public Funcionario.Builder<?> promover(Funcionario funcionario) {
        Cargo cargoAtual = funcionario.getCargo();
        Cargo proximoCargo = proximoCargo(cargoAtual);

        if (proximoCargo != null) {
            System.out.println("Funcionário " + funcionario.getNome() + " promovido para " + proximoCargo);

            return new Funcionario.Builder<>()
                    .setNome(funcionario.getNome())
                    .setTelefones(funcionario.getTelefones())
                    .setEndereco(funcionario.getEndereco())
                    .setSalario(funcionario.getSalario())
                    .setSetor(funcionario.getSetor())
                    .setCargo(proximoCargo);
        } else {
            System.out.println("Não há promoção disponível para " + funcionario.getNome());
            return null;
        }
    }

    private Cargo proximoCargo(Cargo cargoAtual) {
        Cargo[] cargos = Cargo.values();
        int indiceAtual = cargoAtual.ordinal();
        return (indiceAtual < cargos.length - 1) ? cargos[indiceAtual + 1] : null;
    }

}