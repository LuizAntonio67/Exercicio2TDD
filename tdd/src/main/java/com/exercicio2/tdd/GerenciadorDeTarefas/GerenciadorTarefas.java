package com.exercicio2.tdd.GerenciadorDeTarefas;

public class GerenciadorTarefas {
	private ArrayList<Tarefa> listaTarefas;
	
	public GerenciadorTarefas() {
		this.listaTarefas = new ArrayList<>();
	}
	
	public void adicionaTarefa(Tarefa tarefa) {
		listaTarefas.add(tarefa);
	}
	
	public void atualizaTituloTarefa(String tituloAntigo, String novoTitulo) {
		for(Tarefa tarefa: listaTarefas) {
			if (tarefa.getTitulo().equals(tituloAntigo)) {
				tarefa.setTitulo(novoTitulo);	
			}
		}
	}
	
	public void atualizaDescricaoTarefa(String titulo, String descricao) {
		for(Tarefa tarefa: listaTarefas) {
			if (tarefa.getTitulo().equals(titulo)) {
				tarefa.setDescricao(descricao);
			}
	}
}
