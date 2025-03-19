package com.solid.lsp.examples.v1.after;

public class Gerente extends Cargo{

    public Gerente(){
        this.nome = "Gerente";
    }

    @Override
    public void executarPapel() {
        System.out.println("Gerente gerenciando equipe");
    }
}