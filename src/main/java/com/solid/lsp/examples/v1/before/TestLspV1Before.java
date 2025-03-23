package com.solid.lsp.examples.v1.before;

public class TestLspV1Before {

    public void executar(){
        Funcionario ceo = new Ceo();
        Funcionario analista = new Analista();
        Funcionario gerente = new Gerente();

        analista.trabalhar();
        gerente.trabalhar();
        ceo.trabalhar(); //quebra em tempo de execução.
    }

}
