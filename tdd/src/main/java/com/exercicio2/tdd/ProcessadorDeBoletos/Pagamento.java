package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.Date;

public class Pagamento {
    private Boleto boleto;
    private String tipo;

    public Pagamento(Boleto boleto, String tipo) {
        this.boleto = boleto;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCodigoBoleto() {
        return boleto.getCodigo();
    }

    public Date getDataBoleto() {
        return boleto.getData();
    }

    public int getValor_pagoBoleto() {
        return boleto.getValor_pago();
    }
    
}
