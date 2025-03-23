package com.solid.isp.examples.v2.before;

public class TelefoneCelular implements Telefone{


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

}