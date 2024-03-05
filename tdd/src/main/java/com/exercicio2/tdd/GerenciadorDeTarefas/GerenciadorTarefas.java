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
	
	public boolean atualizaTituloTarefa(String tituloAntigo, String novoTitulo) {
		for(Tarefa tarefa: listaTarefas) {
			if (tarefa.getTitulo().equals(tituloAntigo)) {
				tarefa.setTitulo(novoTitulo);	
				return true;
			}
		} return false;
	}
	
	public boolean atualizaDescricaoTarefa(String titulo, String descricao) {
		for(Tarefa tarefa: listaTarefas) {
			if (tarefa.getTitulo().equals(titulo)) {
				tarefa.setDescricao(descricao);
				return true;
			}
		} return false;
	}
}
