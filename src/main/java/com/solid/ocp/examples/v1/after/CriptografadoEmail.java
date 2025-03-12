package com.solid.ocp.examples.v1.after;

public class CriptografadoEmail extends Email{
    @Override
    public void enviar(String assunto, String mensagem) {
        Util.criptografarMensagem(mensagem);
    }
}
