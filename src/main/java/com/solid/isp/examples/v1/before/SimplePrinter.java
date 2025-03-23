package com.solid.isp.examples.v1.before;


public class SimplePrinter implements Printer {

    @Override
    public void printarDocumento() {
        System.out.println("Printando documento");
    }

    @Override
    public void escanearDocumento() {
        //not implemented
    }

    @Override
    public void faxDocumento() {
        //not implemented
    }

}
