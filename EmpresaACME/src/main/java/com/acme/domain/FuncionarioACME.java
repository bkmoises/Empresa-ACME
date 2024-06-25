package com.acme.domain;

public class FuncionarioACME extends Funcionario {
    public FuncionarioACME(Builder builder) {
        super(builder);
    }

    public FuncionarioACME salarioReajustado(double novoSalario) {
        return (FuncionarioACME) new Builder()
                .setNome(this.getNome())
                .setTelefones(this.getTelefones())
                .setEndereco(this.getEndereco())
                .setSalario(novoSalario)
                .setSetor(this.getSetor())
                .setCargo(this.getCargo())
                .build();
    }

    public static class Builder extends Funcionario.Builder<Builder> {
        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public FuncionarioACME build() {
            return new FuncionarioACME(this);
        }
    }
}
