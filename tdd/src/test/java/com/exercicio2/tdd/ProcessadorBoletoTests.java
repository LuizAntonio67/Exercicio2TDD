package com.exercicio2.tdd;

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
class ProcessadorBoletoTests {
    Fatura fatura1;
    Fatura fatura2;
    Fatura fatura3;
    Boleto boleto1;
    Boleto boleto2;
    Boleto boleto3;
    Boleto boleto4;
    Boleto boleto5;
    Boleto boleto6;
    ArrayList<Boleto> lista1;
    ArrayList<Boleto> lista2;
    ArrayList<Boleto> lista3;
    ProcessadorBoletos proc;

    /**
     * Sets up the test environment by initializing the necessary objects.
     */
    @BeforeEach
    void constructor() {
        fatura1 = new Fatura(new Date(), 300, "Yasmine");
        fatura2 = new Fatura(new Date(), 1800, "Alicia");
        fatura3 = new Fatura(new Date(), 3900, "Taha");

        boleto1 = new Boleto(1000, new Date(), 1000);
        boleto2 = new Boleto(20, new Date(), 20);
        boleto3 = new Boleto(500, new Date(), 500);
        boleto4 = new Boleto(160, new Date(), 160);
        boleto5 = new Boleto(250, new Date(), 250);
        boleto6 = new Boleto(900, new Date(), 900);

        lista1 = new ArrayList<>();
        lista1.add(boleto2);
        lista1.add(boleto6);

        lista2 = new ArrayList<>();
        lista2.add(boleto3);
        lista2.add(boleto5);
        lista2.add(boleto4);

        lista3 = new ArrayList<>();
        lista3.add(boleto1);
        lista3.add(boleto3);
        lista3.add(boleto2);
        lista3.add(boleto2);

        proc = new ProcessadorBoletos();
    }

    /**
     * Tests the processamentoBoletos method with a list of boletos and a fatura.
     * Expects the method to return true, indicating that the fatura has been paid.
     */
    @Test
    void verificaProcessamentoBoletos1() {
        assertTrue(proc.processamentoBoletos(lista1, fatura1)); // Soma = 920. Fatura paga
    }

    /**
     * Tests the processamentoBoletos method with a list of boletos and a fatura.
     * Expects the method to return false, indicating that the fatura has not been paid.
     */
    @Test
    void verificaProcessamentoBoletos2() {
        assertFalse(proc.processamentoBoletos(lista2, fatura2)); // Soma = 910. Fatura não paga
    }

    /**
     * Tests the processamentoBoletos method with a list of boletos and a fatura.
     * Expects the method to return false, indicating that the fatura has not been paid.
     */
    @Test
    void verificaProcessamentoBoletos3() {
        assertFalse(proc.processamentoBoletos(lista3, fatura3)); // Soma = 1540. Fatura não paga
    }

    /**
     * Tests the verificaFaturaPaga method after processing a list of boletos and a fatura.
     * Expects the method to return true, indicating that the fatura has been paid.
     */
    @Test
    void verificaFaturaPagaTrue() {
        proc.processamentoBoletos(lista1, fatura1);
        assertTrue(proc.verificaFaturaPaga(fatura1.getId()));
    }

    /**
     * Tests the verificaFaturaPaga method after processing a list of boletos and a fatura.
     * Expects the method to return false, indicating that the fatura has not been paid.
     */
    @Test
    void verificaFaturaPagaFalse() {
        proc.processamentoBoletos(lista2, fatura2);
        assertFalse(proc.verificaFaturaPaga(fatura2.getId()));
    }

}