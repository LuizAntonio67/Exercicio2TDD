package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.Date;
import java.util.UUID;

/**
 * Represents a fatura (invoice) for a client.
 */
public class Fatura  {
    private UUID id;
    private Date data;
    private int valor;
    private String cliente;
    private boolean paga;

    /**
     * Constructs a new Fatura object with the specified data, valor, and cliente.
     * The id is generated using UUID.randomUUID().
     *
     * @param data    the date of the fatura
     * @param valor   the value of the fatura
     * @param cliente the client associated with the fatura
     */
    public Fatura(Date data, int valor, String cliente) {
        this.id = UUID.randomUUID();
        this.data = data;
        this.valor = valor;
        this.cliente = cliente;
        this.paga = false;
    }

    /**
     * Returns the id of the fatura.
     *
     * @return the id of the fatura
     */
    public UUID getId() {
        return id;
    }

    /**
     * Returns the date of the fatura.
     *
     * @return the date of the fatura
     */
    public Date getData() {
        return data;
    }

    /**
     * Returns the value of the fatura.
     *
     * @return the value of the fatura
     */
    public int getValor() {
        return valor;
    }

    /**
     * Returns the client associated with the fatura.
     *
     * @return the client associated with the fatura
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Returns true if the fatura is marked as paid, false otherwise.
     *
     * @return true if the fatura is paid, false otherwise
     */
    public boolean isPaga() {
        return paga;
    }

    /**
     * Marks the fatura as paid.
     */
    public void setPaga() {
        this.paga = true;
    }
}