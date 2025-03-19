package com.solid.lsp.examples.v1.before;

public class Gerente extends Funcionario{

    @Override
    public void trabalhar() {
        System.out.println("Gerente gerenciando a equipe");
    }
}
