package com.exercicio2.tdd.GerenciadorDeTarefas;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorTarefas {
	private ArrayList<Tarefa> listaTarefas;
	
	public GerenciadorTarefas() {
		this.listaTarefas = new ArrayList<>();
	}
	
	public boolean adicionaTarefaTeste(Tarefa tarefa) {
		listaTarefas.add(tarefa);
		return true;
	}

	public void adicionaTarefa(Tarefa tarefa) {
		listaTarefas.add(tarefa);
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

	public boolean atualizaDataVencimentoTarefa(int idProcurado, LocalDate dataVencimento){
		for(Tarefa tarefa: listaTarefas) {
			if (tarefa.getId() == idProcurado) {
				tarefa.setDataVencimento(dataVencimento);
				return true;
			}
	}
	return false;
}

public boolean atualizaPrioridadeTarefa(int idProcurado, Prioridade prioridade){
	for(Tarefa tarefa: listaTarefas) {
		if (tarefa.getId() == idProcurado) {
			tarefa.setPrioridade(prioridade);
			return true;
		}
}
return false;
}

public boolean excluiTarefa(int idProcurado) {
	for(Tarefa tarefa: listaTarefas) {
		if (tarefa.getId() == idProcurado) {
			listaTarefas.remove(tarefa);
			return true;
		}
}
return false;
}

}

