package com.acme.domain;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private String setor;
    private String cargo;
    private static List<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(String nome, List<String> telefones, String endereco, double salario, String setor, String cargo) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public void reajustarSalario(double aumentoPercentual) {
        salario *= (1 + aumentoPercentual / 100);
    }

    public static void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
