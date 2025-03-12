package com.solid.ocp.examples.v2.after;

public class DescontoAlimento implements Desconto {

    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.02;
    }


}
