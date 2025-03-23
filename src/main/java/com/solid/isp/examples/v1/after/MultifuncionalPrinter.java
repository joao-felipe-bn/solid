package com.solid.isp.examples.v1.after;

public class MultifuncionalPrinter implements Printer, Scanner,Fax {

    @Override
    public void faxDocument() {
        System.out.println("Faxing document..");
    }

    @Override
    public void printarDocumento() {
        System.out.println("Printando documento");
    }

    @Override
    public void escanearDocumento() {
        System.out.println("Escaneando documento");
    }

}
