package com.acme.service;

import com.acme.domain.Funcionario;
import com.acme.domain.FuncionarioACME;

public interface IRhService {
    FuncionarioACME aplicarReajuste(Funcionario funcionario);
    Funcionario.Builder<?> promover(Funcionario funcionario);
}