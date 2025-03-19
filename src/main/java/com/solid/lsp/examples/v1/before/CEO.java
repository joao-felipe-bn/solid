package com.solid.lsp.examples.v1.before;

public class CEO extends Funcionario{

    @Override
    public void trabalhar() {
        throw new UnsupportedOperationException("CEO não realiza trabalho operacional");
    }


}
