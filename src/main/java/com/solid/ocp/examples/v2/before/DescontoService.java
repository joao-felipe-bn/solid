package com.solid.ocp.examples.v2.before;


public class DescontoService {

    public double calcularDesconto(Produto produto){

        if(produto.getTipo().equalsIgnoreCase("ELETRONICO")){
            return produto.getPreco() * 0.10;
        }else if(produto.getTipo().equalsIgnoreCase("LIVRO")){
            return produto.getPreco() * 0.05;
        }else if(produto.getTipo().equalsIgnoreCase("LIVRO")){
            return produto.getPreco() * 0.02;
        }
        return 0;
    }
}

