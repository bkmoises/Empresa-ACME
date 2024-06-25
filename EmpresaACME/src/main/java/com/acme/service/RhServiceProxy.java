package com.acme.service;

import com.acme.domain.Funcionario;
import com.acme.domain.FuncionarioACME;

public class RhServiceProxy implements IRhService {
    private IRhService rhService;
    private Boolean usuarioAutorizado;

    public RhServiceProxy(IRhService realService, Boolean usuarioAutorizado) {
        this.rhService = realService;
        this.usuarioAutorizado = usuarioAutorizado;
    }

    @Override
    public FuncionarioACME aplicarReajuste(Funcionario funcionario) {
        if (usuarioAutorizado) {
            return rhService.aplicarReajuste(funcionario);
        } else {
            System.out.println("Usuário não autorizado a aplicar reajuste: " + funcionario.getNome());
            return null;
        }
    }

    @Override
    public Funcionario.Builder<?> promover(Funcionario funcionario) {
        if (usuarioAutorizado) {
            return rhService.promover(funcionario);
        } else {
            System.out.println("Usuário não autorizado a promover: " + funcionario.getNome());
            return null;
        }
    }
}

