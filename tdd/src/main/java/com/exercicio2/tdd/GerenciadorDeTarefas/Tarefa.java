package com.exercicio2.tdd.GerenciadorDeTarefas;

import java.time.LocalDate;

public class Tarefa {
	private int id;
	private String titulo;
	private String descricao;
	private LocalDate dataVencimento;
	private Prioridade prioridade;
	
	public Tarefa(String titulo, String descricao, LocalDate dataVencimento, Prioridade prioridade) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
		this.prioridade = prioridade;
	}

	public int getId() {
		return id;
	}
	public void setId(int proximoId) {
		this.id = proximoId;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getDataVencimento() {
		return dataVencimento;
}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
}
	
	public Prioridade getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}
}