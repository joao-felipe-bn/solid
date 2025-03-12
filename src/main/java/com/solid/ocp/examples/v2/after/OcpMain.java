package com.solid.ocp.examples.v2.after;

public class OcpMain {

    public void inicio() {
        Produto notebook = new Produto("Notebook", 3000, new DescontoEletronico());
        Produto livro = new Produto("Livro Java", 100, new DescontoLivro());
        Produto arroz = new Produto("Pacote de Arroz", 20, new DescontoAlimento());

        System.out.println("Preço do notebook com desconto: R$" + notebook.getPrecoComDesconto());
        System.out.println("Preço do livro com desconto: R$" + livro.getPrecoComDesconto());
        System.out.println("Preço do arroz com desconto: R$" + arroz.getPrecoComDesconto());
    }

}
