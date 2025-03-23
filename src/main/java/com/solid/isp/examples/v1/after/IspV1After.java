package com.solid.isp.examples.v1.after;

public class IspV1After {

    public void executar(){
        var simplePrinter = new SimplePrinter();
        simplePrinter.printarDocumento();

        var multifuncionalPrinter = new MultifuncionalPrinter();
        multifuncionalPrinter.printarDocumento();
        multifuncionalPrinter.escanearDocumento();
        multifuncionalPrinter.faxDocument();

    }

}
