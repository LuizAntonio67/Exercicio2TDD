package com.exercicio2.tdd;

class GerenciadorTarefasTestes {
	
	 @BeforeEach
	    void constructor() {
	        tarefa1 = new Tarefa("Jogar o lixo", "preciso jogar o lixo as 13 horas", "15/12/2024", "Alta");
	        tarefa2 = new Tarefa("Aparar a grama", "preciso apara a grama as 14 horas", "14/12/2024", "Media");
	        tarefa3 = new Tarefa("Jogar pingong", "Quero jogar pingpong as 15 horas", "16/12/2024", "Baixa");
	        
	        gerenciador = new GerenciadorTarefas();
	   
	    }

	    @Test
	    void verificaCriacaoNovaTarefa() {
	        assertTrue(gerenciador.adicionaTarefa(tarefa1)); // caso retorne true, a tarefa foi criada com sucesso
	    }