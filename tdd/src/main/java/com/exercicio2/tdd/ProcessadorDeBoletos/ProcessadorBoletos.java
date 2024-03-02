package com.exercicio2.tdd.ProcessadorDeBoletos;

import java.util.ArrayList;

public class ProcessadorBoletos {
    private ArrayList<Boleto> listaBoletos;
    private ArrayList<Boleto> listaPagamentos;
    private Fatura fatura;

    public ProcessadorBoletos(ArrayList<Boleto> listaBoletos, Fatura fatura) {
        this.listaBoletos = listaBoletos;
        this.listaPagamentos = new ArrayList<>();
        this.fatura = fatura;
    }
    
}
