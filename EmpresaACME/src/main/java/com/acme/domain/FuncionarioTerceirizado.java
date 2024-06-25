package com.acme.domain;

public class FuncionarioTerceirizado extends Funcionario {
    private String empresaContratada;
    private int tempoPrevistoDePermanencia;

    private FuncionarioTerceirizado(Builder builder) {
        super(builder);
        this.empresaContratada = builder.empresaContratada;
        this.tempoPrevistoDePermanencia = builder.tempoPrevistoDePermanencia;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public int getTempoPrevistoDePermanencia() {
        return tempoPrevistoDePermanencia;
    }

    public static class Builder extends Funcionario.Builder<Builder> {
        private String empresaContratada;
        private int tempoPrevistoDePermanencia;

        public Builder setEmpresaContratada(String empresaContratada) {
            this.empresaContratada = empresaContratada;
            return this;
        }

        public Builder setTempoPrevistoDePermanencia(int tempoPrevistoDePermanencia) {
            this.tempoPrevistoDePermanencia = tempoPrevistoDePermanencia;
            return this;
        }

        @Override
        public FuncionarioTerceirizado build() {
            return new FuncionarioTerceirizado(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}