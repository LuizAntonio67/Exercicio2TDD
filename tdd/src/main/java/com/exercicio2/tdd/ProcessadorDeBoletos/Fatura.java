package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.Date;
import java.util.UUID;

public class Fatura  {
    private UUID id;
    private Date data;
    private int valor;
    private String cliente;
    private boolean paga;

    public Fatura(Date data, int valor, String cliente) {
        this.id = UUID.randomUUID();
        this.data = data;
        this.valor = valor;
        this.cliente = cliente;
        this.paga = false;
    }

    public UUID getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public int getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga() {
        this.paga = true;
    }

}
