package com.solid.lsp.examples.v2;

public abstract class Pagamento {
    public void pagar(double valor){
        System.out.println(String.format("Pagamento de %s realizado com sucesso",valor));
    }
}
