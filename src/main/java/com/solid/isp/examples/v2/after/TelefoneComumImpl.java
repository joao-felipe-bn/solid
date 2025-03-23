package com.solid.isp.examples.v2.after;

public class TelefoneComumImpl implements TelefoneComum{
    @Override
    public void tocar() {
        System.out.println("tocando...");
    }

    @Override
    public void discar() {
        System.out.println("Discando...");
    }
}
