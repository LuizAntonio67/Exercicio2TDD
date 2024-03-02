package com.exercicio2.tdd;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exercicio2.tdd.ProcessadorDeBoletos.Boleto;
import com.exercicio2.tdd.ProcessadorDeBoletos.Fatura;
import com.exercicio2.tdd.ProcessadorDeBoletos.Pagamento;
import com.exercicio2.tdd.ProcessadorDeBoletos.ProcessadorBoletos;

class BoletoTests {
    Fatura fatura;
    Boleto boleto;
    Pagamento pagamento;

    @BeforeEach
    void constructor() {
        this.fatura = new Fatura(new Date(), 100, "Luiz");
        this.boleto = new Boleto(123, new Date(), 100);
        this.pagamento = new Pagamento(boleto.getCodigo(), "BOLETO");

        ArrayList<Boleto> lista = new ArrayList<>();
        lista.add(boleto);
        ProcessadorBoletos proc = new ProcessadorBoletos(lista, fatura);
    }

}
