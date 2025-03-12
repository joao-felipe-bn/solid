package com.solid.ocp.examples.v2.after;

public class DescontoEletronico implements Desconto {


    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.10;
    }
}
