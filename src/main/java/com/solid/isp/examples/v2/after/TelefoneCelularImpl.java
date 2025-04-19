package com.solid.isp.examples.v2.after;

public class TelefoneCelularImpl implements TelefoneCelular, TelefoneComum {

    @Override
    public void tocar() {
        System.out.println("Tocando..");
    }

    @Override
    public void discar() {
        System.out.println("Discando..");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirando foto..");
    }

    @Override
    public void conectar3G() {
        System.out.println("Conectando 3G..");
    }

}
