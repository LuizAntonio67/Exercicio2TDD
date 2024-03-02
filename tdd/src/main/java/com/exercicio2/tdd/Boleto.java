package com.exercicio2.tdd;

import java.util.Date;
import java.util.UUID;

public class Boleto {
    private UUID id;
    private int codigo;
    private Date data;
    private int valor_pago;

    public Boleto(int codigo, Date data, int valor_pago) {
        this.id = UUID.randomUUID();
        this.codigo = codigo;
        this.data = data;
        this.valor_pago = valor_pago;
    }

    public UUID getId() {
        return id;
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
