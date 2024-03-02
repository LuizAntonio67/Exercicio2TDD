package com.exercicio2.tdd;

import java.util.ArrayList;
import java.util.Date;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoletoTests {
    Fatura fatura;
    Boleto boleto;
    Pagamento pagamento;

    @BeforeEach
    void constructor() {
        this.fatura = new Fatura(new Date(), 100, "Luiz");
        this.boleto = new Boleto(123, new Date(), 100);
        this.pagamento = new Pagamento(boleto, "BOLETO");
    }
    
    @Test
    void verificaCriacaoProcessador() {
        ArrayList<Boleto> lista = new ArrayList<>();
        lista.add(boleto);
        ProcessadorBoletos proc = new ProcessadorBoletos(lista);
    }

}
