package com.solid.lsp.examples.v1.after;

public class CEO extends Cargo {


    public CEO() {
        this.nome = "CEO";
    }


    @Override
    public void executarPapel() {
        System.out.println("CEO definindo a estratégia da empresa");
    }

}
