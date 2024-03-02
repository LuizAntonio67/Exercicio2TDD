package com.exercicio2.tdd.ProcessadorDeBoletos;

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

    public Boleto getBoleto() {
        return boleto;
    }

}
