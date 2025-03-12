package com.solid.ocp.examples.v1.after;

public class TextoEmail extends Email{

    @Override
    public void enviar(String assunto, String mensagem) {
        Util.removerFormatacao(mensagem);
    }

}
