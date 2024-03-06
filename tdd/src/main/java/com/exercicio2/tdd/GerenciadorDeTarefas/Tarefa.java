package com.exercicio2.tdd.GerenciadorDeTarefas;

public class Tarefa {
	
	private int id;
	private String titulo;
	private String descricao;
	private String dataNascimento;
	private String prioridade;
	
	public Tarefa(String titulo, String descricao, String dataNascimento, String prioridade) {
		this.id += 1;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataNascimento = dataNascimento;
		this.prioridade = prioridade;
	}

	public int getId() {
		return id;
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
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
}