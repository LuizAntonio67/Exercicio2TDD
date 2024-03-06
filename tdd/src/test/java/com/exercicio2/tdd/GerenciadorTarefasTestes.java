package com.exercicio2.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.exercicio2.tdd.GerenciadorDeTarefas.GerenciadorTarefas;
import com.exercicio2.tdd.GerenciadorDeTarefas.Tarefa;

class GerenciadorTarefasTestes {
	Tarefa tarefa1;
	Tarefa tarefa2;
	Tarefa tarefa3;
	GerenciadorTarefas gerenciador;
	
	 @BeforeEach
	    void constructor() {
	        tarefa1 = new Tarefa("Jogar o lixo", "preciso jogar o lixo as 13 horas", "15/12/2024", "Alta");
	        tarefa2 = new Tarefa("Aparar a grama", "preciso apara a grama as 14 horas", "14/12/2024", "Media");
	        tarefa3 = new Tarefa("Jogar pingong", "Quero jogar pingpong as 15 horas", "16/12/2024", "Baixa");
	        
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
        assertTrue(gerenciador.atualizaDataVencimentoTarefa(1, "13/12/2024")); // caso retorne true, atualizou a data da tarefa com sucesso
    }
		@Test
    void verificaMarcarPrioridadeTarefa() {
			gerenciador.adicionaTarefa(tarefa3);
        assertTrue(gerenciador.atualizaPrioridadeTarefa(1, "Baixa")); // caso retorne true, atualizou a prioridade da tarefa
    }


		}