package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * The ProcessadorBoletos class represents a processor for boletos (payment slips) and faturas (invoices).
 * It allows processing boletos and checking if a fatura has been paid.
 */
public class ProcessadorBoletos {
    private HashMap<Fatura, ArrayList<Pagamento>> listaFaturas;

    /**
     * Constructs a new ProcessadorBoletos object.
     * Initializes the listaFaturas HashMap.
     */
    public ProcessadorBoletos() {
        this.listaFaturas = new HashMap<>();
    }

    /**
     * Processes the boletos and updates the fatura status.
     * 
     * @param listaBoletos the list of boletos to be processed
     * @param fatura the fatura to be updated
     * @return true if the fatura has been fully paid, false otherwise
     */
    public boolean processamentoBoletos(ArrayList<Boleto> listaBoletos, Fatura fatura) {
        int soma = 0;
        for (int i = 0; i < listaBoletos.size(); i++) {
            if(i == 0) {
                ArrayList<Pagamento> listaPagamentos = new ArrayList<>();
                listaPagamentos.add(new Pagamento(listaBoletos.get(i), "BOLETO"));
                listaFaturas.put(fatura, listaPagamentos);
            } else {
                listaFaturas.get(fatura).add(new Pagamento(listaBoletos.get(i), "BOLETO"));
            }

            soma += listaBoletos.get(i).getValor_pago();
        }

        if(soma >= fatura.getValor()) {
            fatura.setPaga();
            return true;
        }
        return false;
    }

    /**
     * Checks if a fatura with the given ID has been paid.
     * 
     * @param id the ID of the fatura to be checked
     * @return true if the fatura has been paid, false otherwise
     */
    public boolean verificaFaturaPaga(UUID id) {
        for (Fatura fatura : listaFaturas.keySet()) {
            if(fatura.getId().equals(id)) {
                if((fatura.isPaga())) return true;
            }
        }

        return false;
    }
}
