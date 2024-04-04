package com.exercicio2.tdd.junit5Tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.exercicio2.tdd.ProcessadorDeBoletos.Boleto;
import com.exercicio2.tdd.ProcessadorDeBoletos.Fatura;
import com.exercicio2.tdd.ProcessadorDeBoletos.ProcessadorBoletos;

public class ProcessadorBoletosJunit5Tests {
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

    @Test
    @DisplayName("Verifica um valor menor dos boletos do que o valor da fatura")
    void verificaValorMenor() {
        lista.add(boleto1);
        assertFalse(proc.processamentoBoletos(lista, fatura));
    }

    @Test
    @DisplayName("Verifica um valor igual dos boletos do que o valor da fatura")
    void verificaValorIgual() {
        lista.add(boleto2);
        assertTrue(proc.processamentoBoletos(lista, fatura));
    }

    @Test
    @DisplayName("Verifica um valor maior dos boletos do que o valor da fatura")
    void verificaValorMaior() {
        lista.add(boleto3);
        assertTrue(proc.processamentoBoletos(lista, fatura));
    }

    @Test
    @DisplayName("Verifica se a fatura está paga quando é passado um valor menor dos boletos do que o valor da fatura")
    void verificaValorMenor2() {
        lista.add(boleto1);
        proc.processamentoBoletos(lista, fatura);
        assertFalse(proc.verificaFaturaPaga(fatura.getId()));
    }

    @Test
    @DisplayName("Verifica se a fatura está paga quando é passado um valor maior dos boletos do que o valor da fatura")
    void verificaValorMaior2() {
        lista.add(boleto3);
        proc.processamentoBoletos(lista, fatura);
        assertTrue(proc.verificaFaturaPaga(fatura.getId()));
    }
}
