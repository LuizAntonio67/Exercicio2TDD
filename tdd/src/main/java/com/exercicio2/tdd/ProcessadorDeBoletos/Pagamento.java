package com.exercicio2.tdd.ProcessadorDeBoletos;

public class Pagamento {
    private int codigo_boleto;
    private String tipo;

    public Pagamento(int codigo_boleto, String tipo) {
        this.codigo_boleto = codigo_boleto;
        this.tipo = tipo;
    }

    public int getCodigo_Boleto() {
        return codigo_boleto;
    }

    public String getTipo() {
        return tipo;
    }
    
}
