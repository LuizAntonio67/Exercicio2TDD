package com.exercicio2.tdd.functionalTests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exercicio2.tdd.ProcessadorDeBoletos.*;

/**
 * This class contains unit tests for the Boleto class and its related classes.
 */
class ProcessadorBoletosFunctionalTests {
    Fatura fatura;
    Boleto boleto1;
    Boleto boleto2;
    Boleto boleto3;
    ArrayList<Boleto> lista;
    ProcessadorBoletos proc;

    @BeforeEach
    void eptConstructor() {
        fatura = new Fatura(new Date(), 300, "Yasmine");
        boleto1 = new Boleto(20, new Date(), 20);
        boleto2 = new Boleto(300, new Date(), 300);
        boleto3 = new Boleto(1000, new Date(), 1000);
        lista = new ArrayList<>();
        proc = new ProcessadorBoletos();
    }

    // Equivalence partitioning tests
    @Test
    void verificaValorMenor() {
        lista.add(boleto1);
        assertFalse(proc.processamentoBoletos(lista, fatura));
    }

    @Test
    void verificaValorIgual() {
        lista.add(boleto2);
        assertTrue(proc.processamentoBoletos(lista, fatura));
    }

    @Test
    void verificaValorMaior() {
        lista.add(boleto3);
        assertTrue(proc.processamentoBoletos(lista, fatura));
    }

    // Decision table tests
    @Test
    void verificaValorMenor2() {
        lista.add(boleto1);
        proc.processamentoBoletos(lista, fatura);
        assertFalse(proc.verificaFaturaPaga(fatura.getId()));
    }

    @Test
    void verificaValorMaior2() {
        lista.add(boleto3);
        proc.processamentoBoletos(lista, fatura);
        assertTrue(proc.verificaFaturaPaga(fatura.getId()));
    }

}
