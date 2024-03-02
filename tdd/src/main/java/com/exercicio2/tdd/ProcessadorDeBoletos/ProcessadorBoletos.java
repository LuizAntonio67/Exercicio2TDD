package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.ArrayList;
import java.util.HashMap;

public class ProcessadorBoletos {
    private HashMap<Fatura, ArrayList<Pagamento>> listaFaturas;

    public ProcessadorBoletos() {
        this.listaFaturas = new HashMap<>();
    }

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
    
}
