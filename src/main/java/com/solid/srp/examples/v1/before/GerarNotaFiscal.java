package com.solid.srp.examples.v1.before;

import java.math.BigDecimal;

public class GerarNotaFiscal {

    public void validarDadosDoCliente(){
        System.out.println("Validar Dados Cliente");
    }

    public void gerarImpostoFiscal(BigDecimal ValorVenda){
        System.out.println("Gerar Imposto Fiscal");
    }

    public void salvarNotaFiscal(BigDecimal ValorFinal) {
        System.out.println("Salvar Nota Fiscal");
    }

    public void imprimirCupomFiscal() {
        System.out.println("Imprimir Cupom Fiscal");
    }

    public void enviarCupomPorEmail() {
        System.out.println("Enviar Cupom Por Email");
    }

}
