package com.solid.lsp.examples.v1.before;

public class TestLspV1Before {

    public void executar(){
        Funcionario ceo = new CEO();
        ceo.trabalhar(); //quebra em tempo de execução.
    }

}
