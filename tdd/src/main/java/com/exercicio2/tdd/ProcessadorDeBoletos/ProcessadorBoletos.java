package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.ArrayList;
import java.util.HashMap;

public class ProcessadorBoletos {
    private HashMap<Integer, Pagamento> listaPagamentos;

    public ProcessadorBoletos() {
        this.listaPagamentos = new HashMap<>();
    }

    public boolean processamentoBoletos(ArrayList<Boleto> listaBoletos, Fatura fatura) {
        int soma = 0;
        for (Boleto boleto : listaBoletos) {
            soma += boleto.getValor_pago();
            listaPagamentos.put(boleto.getCodigo(), new Pagamento("BOLETO"));
        }

        if(soma >= fatura.getValor()) {
            fatura.setPaga();
            return true;
        }
        return false;
    }
    
}
