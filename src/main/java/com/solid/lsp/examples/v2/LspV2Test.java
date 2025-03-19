package com.solid.lsp.examples.v2;

public class LspV2Test {

    public void executar(){

        Pagamento pagamentoPix = new MetodoPix("email@example.com");
        Pagamento pagamentoCartaoCredito = new MetodoCartaoCredito();
        Pagamento pagamentoBoleto = new MetodoBoleto();

        double valor = 10.00;
        pagamentoPix.pagar(valor);
        pagamentoCartaoCredito.pagar(valor);
        pagamentoBoleto.pagar(valor);

    }

}
