package com.exercicio2.tdd.GerenciadorDeTarefas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

public ArrayList<Tarefa> getListaTarefas() {
	return listaTarefas;
}

public void exibirTarefasOrdenadas() {
        // Ordena a lista de tarefas usando um comparador personalizado
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

        // Exibe as tarefas ordenadas
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
    }


}

