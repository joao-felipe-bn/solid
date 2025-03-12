package com.solid.ocp.examples.v1.after;

public class HtmlEmail extends Email {

    @Override
    public void enviar(String assunto, String mensagem) {
        Util.inserirHtml(mensagem);
    }
}
