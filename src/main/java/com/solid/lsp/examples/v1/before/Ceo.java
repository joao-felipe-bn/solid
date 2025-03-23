package com.solid.lsp.examples.v1.before;

public class Ceo extends Funcionario{

    @Override
    public void trabalhar() {
        throw new UnsupportedOperationException("CEO não realiza trabalho operacional");
    }


}
