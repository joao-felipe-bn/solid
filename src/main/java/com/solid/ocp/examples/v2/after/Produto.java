package com.solid.ocp.examples.v2.after;

public class Produto {

    private String nome;
    private double preco;
    private Desconto desconto;

    public Produto(String nome, double preco, Desconto desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double getPrecoComDesconto(){
        return preco - desconto.aplicarDesconto(preco);
    }

}
