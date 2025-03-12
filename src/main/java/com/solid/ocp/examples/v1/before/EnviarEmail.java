package com.solid.ocp.examples.v1.before;


import com.solid.ocp.examples.v1.TipoEmail;

public class EnviarEmail {


    public void enviarEmail(String mensagem, String assunto, TipoEmail tipoEmail){
        if(TipoEmail.TEXTO.equals(tipoEmail)){
            removerFormatacao(mensagem);
        }else if(TipoEmail.HTML.equals(tipoEmail)){
            inserirHtml(mensagem);
        }else if(TipoEmail.CRIPTOGRAFADO.equals(tipoEmail)){
            criptografarMensagem(mensagem);
        }
    }

    private void removerFormatacao(String mensagem){
        System.out.println("removendo formatacao: "+mensagem);
    }

    private void inserirHtml(String mensagem){
        System.out.println("inserindo html: "+mensagem);
    }

    private void criptografarMensagem(String mensagem){
        System.out.println("criptografando mensagem: "+mensagem);
    }

}