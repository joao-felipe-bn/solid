package com.solid.lsp.examples.v1.after;

public class TestLspV1After {

    public void executar(){
        Cargo ceo = new CEO();
        Cargo gerente = new Gerente();
        Cargo analista = new Analista();

        ceo.executarPapel();
        gerente.executarPapel();
        analista.executarPapel();
    }

}
