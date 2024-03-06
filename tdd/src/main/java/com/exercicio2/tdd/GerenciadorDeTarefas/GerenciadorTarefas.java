package com.exercicio2.tdd.GerenciadorDeTarefas;

import java.util.ArrayList;

public class GerenciadorTarefas {
	private ArrayList<Tarefa> listaTarefas;
	
	public GerenciadorTarefas() {
		this.listaTarefas = new ArrayList<>();
	}
	
	public boolean adicionaTarefa(Tarefa tarefa) {
		listaTarefas.add(tarefa);
		return true;
	}
	
	public boolean atualizaTituloTarefa(int idProcurado, String novoTitulo) {
		for(Tarefa tarefa: listaTarefas) {
			if (tarefa.getId()== idProcurado) {
				tarefa.setTitulo(novoTitulo);	
				return true;
			}
		}
		return false;
	}
	
	public boolean atualizaDescricaoTarefa(int idProcurado, String descricao) {
		for(Tarefa tarefa: listaTarefas) {
			if (tarefa.getId() == idProcurado) {
				tarefa.setDescricao(descricao);
				return true;
			}
	}
	return false;
	}
}

