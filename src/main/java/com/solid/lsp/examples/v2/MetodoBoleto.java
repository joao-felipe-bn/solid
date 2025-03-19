package com.solid.lsp.examples.v2;

public class MetodoBoleto extends Pagamento{

    @Override
    public void pagar(double valor) {
        gerarBoleto();
        super.pagar(valor);
    }

    private void gerarBoleto(){
        System.out.println("Boleto gerado. Pague até o vencimento.");
    }

}
