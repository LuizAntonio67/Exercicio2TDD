package com.exercicio2.tdd.GerenciadorDeTarefas;

public class GerenciadorTarefas {
	private ArrayList<Tarefa> listaTarefas;
	
	public GerenciadorTarefas() {
		this.listaTarefas = new ArrayList<>();
	}
	
	public adicionaTarefa(Tarefa tarefa) {
		listaTarefas.add(tarefa);
	}
	
	public atualizaTituloTarefa(String tituloAntigo, String novoTitulo) {
		for(Tarefa tarefa: listaTarefas) {
			if (tarefa.getTitulo().equals(tituloAntigo)) {
				tarefa.setTitulo(novoTitulo);
				
			}
			
		}
	}

}
