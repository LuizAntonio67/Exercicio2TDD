package com.exercicio2.tdd;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoletoTests {

    @BeforeEach
    void constructor() {
        Fatura fatura = new Fatura(new Date(), 100, "Luiz");
        Boleto boleto = new Boleto(123, new Date(), 100);
        Pagamento pagamento = new Pagamento(boleto, "BOLETO");
    }

}
