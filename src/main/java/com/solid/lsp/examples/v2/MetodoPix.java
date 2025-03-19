package com.solid.lsp.examples.v2;

public class MetodoPix extends Pagamento {

    private String chavePix;


    public MetodoPix(String chavePix) {
        this.chavePix = chavePix;
    }
    public MetodoPix() {
    }

    @Override
    public void pagar(double valor) {
        System.out.println(String.format("Chave Pix %s",chavePix));
        super.pagar(valor);
    }
}
