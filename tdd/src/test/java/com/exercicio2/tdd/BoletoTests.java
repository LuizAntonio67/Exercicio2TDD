package com.exercicio2.tdd;

import java.util.Date;
import org.junit.jupiter.api.Test;

class BoletoTests {
    
    @Test
    void verificaCriacaoFatura() {
        Fatura fatura = new Fatura(new Date(), 100, "Luiz");
    }

    @Test
    void verificaCriacaoBoleto() {
        Boleto boleto = new Boleto(123, new Date(), 100);
    }

    @Test
    void verificaCriacaoPagamento() {
        Pagamento pagamento = new Pagamento(new Boleto(123, new Date(), 100), "BOLETO");
    }

}
