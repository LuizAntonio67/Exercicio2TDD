package com.exercicio2.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exercicio2.tdd.ProcessadorDeBoletos.*;

class BoletoTests {
    Fatura fatura;
    Boleto boleto;
    ProcessadorBoletos proc;
    ArrayList<Boleto> lista;

    @BeforeEach
    void constructor() {
        this.fatura = new Fatura(new Date(), 100, "Luiz");
        this.boleto = new Boleto(123, new Date(), 100);

        this.lista = new ArrayList<>();
        lista.add(boleto);
        this.proc = new ProcessadorBoletos();
    }

    @Test
    void verificaProcessamentoBoletos() {
        assertTrue(proc.processamentoBoletos(lista, fatura));
    }

}
