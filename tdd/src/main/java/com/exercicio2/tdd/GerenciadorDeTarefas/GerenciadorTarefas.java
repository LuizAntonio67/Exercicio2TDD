package com.exercicio2.tdd.GerenciadorDeTarefas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorTarefas {
	private Map<Integer, Tarefa> mapaTarefas;
	private int proximoId;
	
	public GerenciadorTarefas() {
		 mapaTarefas = new HashMap<>();
		 proximoId = 1;
	}
	
	public boolean adicionaTarefaTeste(Tarefa tarefa) {
		tarefa.setId(proximoId);
		mapaTarefas.put(proximoId, tarefa);
		proximoId++;
		return true;
	}

	public void adicionaTarefa(Tarefa tarefa) {
		tarefa.setId(proximoId);
		mapaTarefas.put(proximoId, tarefa);
		proximoId++;
	}
	
	public boolean atualizaTituloTarefa(int idProcurado, String novoTitulo) {
		mapaTarefas.get(idProcurado).setTitulo(novoTitulo);
		return true;
	}
	
	public boolean atualizaDescricaoTarefa(int idProcurado, String descricao) {
		mapaTarefas.get(idProcurado).setDescricao(descricao);
		return true;
	}

	public boolean atualizaDataVencimentoTarefa(int idProcurado, LocalDate dataVencimento){
		mapaTarefas.get(idProcurado).setDataVencimento(dataVencimento);
		return true;
}

public boolean atualizaPrioridadeTarefa(int idProcurado, Prioridade prioridade){
	mapaTarefas.get(idProcurado).setPrioridade(prioridade);
	return true;
}

public boolean excluiTarefa(int idProcurado) {
	mapaTarefas.remove(idProcurado);
	return true;
}

public void exibirTarefasOrdenadas() {
	List<Tarefa> listaTarefas = new ArrayList<>(mapaTarefas.values());
	// Ordena a lista de tarefas usando um comparador
	Collections.sort(listaTarefas, new Comparator<Tarefa>() {
		@Override
		public int compare(Tarefa tarefa1, Tarefa tarefa2) {
			// Compara as datas de vencimento
			int compareDataVencimento = tarefa1.getDataVencimento().compareTo(tarefa2.getDataVencimento());
			if (compareDataVencimento != 0) {
				return compareDataVencimento;
			}
			// Se as datas de vencimento forem iguais, compara as prioridades
			return tarefa1.getPrioridade().compareTo(tarefa2.getPrioridade());
		}
	});
	// Exibe as tarefas em ordem
	for (Tarefa tarefa : listaTarefas) {
		System.out.println(tarefa);
	}
}
}
