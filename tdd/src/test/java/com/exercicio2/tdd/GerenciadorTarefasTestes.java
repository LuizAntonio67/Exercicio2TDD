package com.exercicio2.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import com.exercicio2.tdd.GerenciadorDeTarefas.GerenciadorTarefas;
import com.exercicio2.tdd.GerenciadorDeTarefas.Tarefa;
import com.exercicio2.tdd.GerenciadorDeTarefas.Prioridade;

class GerenciadorTarefasTestes {
	Tarefa tarefa1;
	Tarefa tarefa2;
	Tarefa tarefa3;
	GerenciadorTarefas gerenciador;
	
	 @BeforeEach
	    void constructor() {
	        tarefa1 = new Tarefa("Jogar o lixo", "preciso jogar o lixo as 13 horas", LocalDate.of(2024, 1, 15), Prioridade.ALTA);
	        tarefa2 = new Tarefa("Aparar a grama", "preciso apara a grama as 14 horas", LocalDate.of(2024, 2, 15), Prioridade.MEDIA);
	        tarefa3 = new Tarefa("Jogar pingong", "Quero jogar pingpong as 15 horas", LocalDate.of(2024, 3, 6), Prioridade.BAIXA);
	        
	        gerenciador = new GerenciadorTarefas();
	   
	    }

	    @Test
	    void verificaCriacaoNovaTarefa() {
	        assertTrue(gerenciador.adicionaTarefaTeste(tarefa1)); // caso retorne true, a tarefa foi criada com sucesso
	    }
	    
	    @Test
	    void verificaMudaTituloTarefa() {
				gerenciador.adicionaTarefa(tarefa1);
	        assertTrue(gerenciador.atualizaTituloTarefa(1, "Limpar a casa")); // caso retorne true, atualizou o titulo com sucesso
	    }
	    
	    @Test
	    void verificaAtualizaDescricaoTarefa()  {
				gerenciador.adicionaTarefa(tarefa2);
	        assertTrue(gerenciador.atualizaDescricaoTarefa(1, "Preciso limpar a minha casa as 14 horas")); // caso retorne true, atualizou a descricao
			}

			@Test
    void verificaAtualizaDataVencimentoTarefa() {
			gerenciador.adicionaTarefa(tarefa3);
        assertTrue(gerenciador.atualizaDataVencimentoTarefa(1,LocalDate.of(2023, 2, 15))); // caso retorne true, atualizou a data da tarefa com sucesso
    }
		@Test
    void verificaMarcarPrioridadeTarefa() {
			gerenciador.adicionaTarefa(tarefa3);
        assertTrue(gerenciador.atualizaPrioridadeTarefa(1, Prioridade.MEDIA)); // caso retorne true, atualizou a prioridade da tarefa
    }
		@Test
    void verificaExcluirTarefa() {
			gerenciador.adicionaTarefa(tarefa3);
        assertTrue(gerenciador.excluiTarefa(1)); // caso retorne true, excluiu a tarefa com sucesso
    }
		@Test
    void testExibirTarefasOrdenadas() {
        // Adiciona algumas tarefas fora de ordem
        Tarefa tarefa1 = new Tarefa("jogar futebol", "quero jogar futebol as 15:00", LocalDate.of(2024, 3, 15), Prioridade.ALTA);
        Tarefa tarefa2 = new Tarefa("Jogar Basquete", "talvez eu jogue basquete as 16:00", LocalDate.of(2024, 3, 10), Prioridade.BAIXA);
        Tarefa tarefa3 = new Tarefa("Jogar tennis", "Gostaria de jogar tênis as 17:00", LocalDate.of(2024, 3, 20), Prioridade.MEDIA);

        // Adiciona as tarefas à lista do gerenciador
        gerenciador.adicionaTarefa(tarefa1);
        gerenciador.adicionaTarefa(tarefa2);
        gerenciador.adicionaTarefa(tarefa3);

        // Chama o método para exibir tarefas ordenadas
        gerenciador.exibirTarefasOrdenadas();

        // Obter a lista de tarefas após a ordenação
        ArrayList<Tarefa> tarefasOrdenadas = gerenciador.getListaTarefas();

        // Verifica se as tarefas estão ordenadas corretamente
        assertEquals("Jogar Basquete", tarefasOrdenadas.get(0).getDescricao());
        assertEquals("jogar futebol", tarefasOrdenadas.get(1).getDescricao());
        assertEquals("Jogar tennis", tarefasOrdenadas.get(2).getDescricao());
    }
}
		