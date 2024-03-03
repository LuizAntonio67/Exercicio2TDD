package com.exercicio2.tdd.ProcessadorDeBoletos;

public class Pagamento {
    private Boleto boleto;
    private String tipo;

    /**
     * Constructs a new Pagamento object with the specified boleto and tipo.
     *
     * @param boleto the boleto associated with the payment
     * @param tipo the type of payment
     */
    public Pagamento(Boleto boleto, String tipo) {
        this.boleto = boleto;
        this.tipo = tipo;
    }

    /**
     * Returns the type of payment.
     *
     * @return the type of payment
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Returns the boleto associated with the payment.
     *
     * @return the boleto associated with the payment
     */
    public Boleto getBoleto() {
        return boleto;
    }
}