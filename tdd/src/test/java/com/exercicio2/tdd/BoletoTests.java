package com.exercicio2.tdd;

import java.util.Date;
import org.junit.jupiter.api.Test;

class BoletoTests {
    
    @Test
    void verificaCriacaoFatura() {
        Fatura fatura = new Fatura(new Date(), 100, "Luiz");
    }

}
