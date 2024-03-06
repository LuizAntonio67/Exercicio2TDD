package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.Date;

public class Boleto {
    private int codigo;
    private Date data;
    private int valor_pago;

    /**
     * Constructs a new Boleto object with the specified codigo, data, and valor_pago.
     * 
     * @param codigo The codigo of the boleto.
     * @param data The data of the boleto.
     * @param valor_pago The valor_pago of the boleto.
     */
    public Boleto(int codigo, Date data, int valor_pago) {
        this.codigo = codigo;
        this.data = data;
        this.valor_pago = valor_pago;
    }

    /**
     * Returns the codigo of the boleto.
     * 
     * @return The codigo of the boleto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Returns the data of the boleto.
     * 
     * @return The data of the boleto.
     */
    public Date getData() {
        return data;
    }

    /**
     * Returns the valor_pago of the boleto.
     * 
     * @return The valor_pago of the boleto.
     */
    public int getValor_pago() {
        return valor_pago;
    }
}