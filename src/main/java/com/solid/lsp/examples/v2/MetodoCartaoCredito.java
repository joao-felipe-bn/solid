package com.solid.lsp.examples.v2;

public class MetodoCartaoCredito extends Pagamento{

    @Override
    public void pagar(double valor) {
        valor+=(valor*5)/100;
        super.pagar(valor);
    }
}
