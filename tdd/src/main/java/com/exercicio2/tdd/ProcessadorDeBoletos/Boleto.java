package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.Date;

public class Boleto {
    private int codigo;
    private Date data;
    private int valor_pago;

    public Boleto(int codigo, Date data, int valor_pago) {
        this.codigo = codigo;
        this.data = data;
        this.valor_pago = valor_pago;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public int getValor_pago() {
        return valor_pago;
    }
    
}
