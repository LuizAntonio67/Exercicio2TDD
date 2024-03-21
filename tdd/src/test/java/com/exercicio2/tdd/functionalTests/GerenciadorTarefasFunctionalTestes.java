import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exercicio2.tdd.GerenciadorDeTarefas.GerenciadorTarefas;
import com.exercicio2.tdd.GerenciadorDeTarefas.Prioridade;
import com.exercicio2.tdd.GerenciadorDeTarefas.Tarefa;

class GerenciadorTarefasFunctionalTestes {
    GerenciadorTarefas gerenciador;
    
    @BeforeEach
    void setUp() {
        gerenciador = new GerenciadorTarefas();
        gerenciador.adicionaTarefa(new Tarefa("Jogar o lixo", "preciso jogar o lixo as 13 horas", LocalDate.of(2024, 1, 15), Prioridade.ALTA));
        gerenciador.adicionaTarefa(new Tarefa("Aparar a grama", "preciso apara a grama as 14 horas", LocalDate.of(2024, 2, 15), Prioridade.MEDIA));
    }

    //partições de equivalencia 
    @Test
    void testAtualizaTarefaSemAlterarPrioridade() {
        assertTrue(gerenciador.atualizaTituloTarefa(0, "Limpar a casa")); // Título alterado
        assertTrue(gerenciador.atualizaDescricaoTarefa(0, "Limpar a casa às 13 horas")); // Descrição alterada
        assertFalse(gerenciador.atualizaPrioridadeTarefa(0, Prioridade.ALTA)); // Prioridade não alterada
        assertTrue(gerenciador.atualizaDataVencimentoTarefa(0, LocalDate.of(2024, 1, 20))); // Data de vencimento alterada
    }
    
    @Test
    void testAtualizaTarefaComTodosDetalhesModificados() {
        assertTrue(gerenciador.atualizaTituloTarefa(1, "Cortar a grama")); // Título alterado
        assertTrue(gerenciador.atualizaDescricaoTarefa(1, "Cortar a grama às 14 horas")); // Descrição alterada
        assertTrue(gerenciador.atualizaPrioridadeTarefa(1, Prioridade.ALTA)); // Prioridade alterada
        assertTrue(gerenciador.atualizaDataVencimentoTarefa(1, LocalDate.of(2024, 2, 20))); // Data de vencimento alterada
    }
    
    @Test
    void testAtualizaTarefaSemAlterarDataVencimento() {
        assertTrue(gerenciador.atualizaTituloTarefa(0, "Limpar a casa")); // Título alterado
        assertTrue(gerenciador.atualizaDescricaoTarefa(0, "Limpar a casa às 13 horas")); // Descrição alterada
        assertTrue(gerenciador.atualizaPrioridadeTarefa(0, Prioridade.ALTA)); // Prioridade alterada
        assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, LocalDate.of(2024, 1, 15))); // Data de vencimento não alterada
    }
    
    @Test
    void testAtualizaTarefaSemAlterarDescricao() {
        assertTrue(gerenciador.atualizaTituloTarefa(1, "Cortar a grama")); // Título alterado
        assertFalse(gerenciador.atualizaDescricaoTarefa(1, "preciso apara a grama as 14 horas")); // Descrição não alterada
        assertTrue(gerenciador.atualizaPrioridadeTarefa(1, Prioridade.ALTA)); // Prioridade alterada
        assertTrue(gerenciador.atualizaDataVencimentoTarefa(1, LocalDate.of(2024, 2, 20))); // Data de vencimento alterada
    }
    
    @Test
    void testAtualizaTarefaSemAlterarDescricaoEPrioridade() {
        assertTrue(gerenciador.atualizaTituloTarefa(0, "Limpar a casa")); // Título alterado
        assertFalse(gerenciador.atualizaDescricaoTarefa(0, "preciso jogar o lixo as 13 horas")); // Descrição não alterada
        assertFalse(gerenciador.atualizaPrioridadeTarefa(0, Prioridade.ALTA)); // Prioridade não alterada
        assertTrue(gerenciador.atualizaDataVencimentoTarefa(0, LocalDate.of(2024, 1, 20))); // Data de vencimento alterada
    }
    
    @Test
    void testAtualizaTarefaSemAlterarDescricaoEDataVencimento() {
        assertTrue(gerenciador.atualizaTituloTarefa(1, "Cortar a grama")); // Título alterado
        assertFalse(gerenciador.atualizaDescricaoTarefa(1, "preciso apara a grama as 14 horas")); // Descrição não alterada
        assertTrue(gerenciador.atualizaPrioridadeTarefa(1, Prioridade.ALTA)); // Prioridade alterada
        assertFalse(gerenciador.atualizaDataVencimentoTarefa(1, LocalDate.of(2024, 2, 15))); // Data de vencimento não alterada
    }
    
    @Test
    void testAtualizaTarefaSemAlterarDescricaoDataVencimentoEPrioridade() {
        assertTrue(gerenciador.atualizaTituloTarefa(0, "Limpar a casa")); // Título alterado
        assertFalse(gerenciador.atualizaDescricaoTarefa(0, "preciso jogar o lixo as 13 horas")); // Descrição não alterada
        assertFalse(gerenciador.atualizaPrioridadeTarefa(0, Prioridade.ALTA)); // Prioridade não alterada
        assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, LocalDate.of(2024, 1, 15))); // Data de vencimento não alterada
    }
    
    @Test
    void testAtualizaTarefaSemAlterarTitulo() {
        assertFalse(gerenciador.atualizaTituloTarefa(1, "Aparar a grama")); // Título não alterado
        assertTrue(gerenciador.atualizaDescricaoTarefa(1, "Cortar a grama às 14 horas")); // Descrição alterada
        assertTrue(gerenciador.atualizaPrioridadeTarefa(1, Prioridade.ALTA)); // Prioridade alterada
        assertTrue(gerenciador.atualizaDataVencimentoTarefa(1, LocalDate.of(2024, 2, 20))); // Data de vencimento alterada
    }
    
    @Test
void testAtualizaTarefaSemAlterarTituloEPrioridade() {
    assertFalse(gerenciador.atualizaTituloTarefa(0, "Jogar o lixo")); // Título não alterado
    assertTrue(gerenciador.atualizaDescricaoTarefa(0, "preciso jogar o lixo as 13 horas")); // Descrição alterada
    assertFalse(gerenciador.atualizaPrioridadeTarefa(0, Prioridade.ALTA)); // Prioridade não alterada
    assertTrue(gerenciador.atualizaDataVencimentoTarefa(0, LocalDate.of(2024, 1, 20))); // Data de vencimento alterada
}

@Test
void testAtualizaTarefaSemAlterarTituloEDataVencimento() {
    assertFalse(gerenciador.atualizaTituloTarefa(1, "Aparar a grama")); // Título não alterado
    assertTrue(gerenciador.atualizaDescricaoTarefa(1, "Cortar a grama às 14 horas")); // Descrição alterada
    assertTrue(gerenciador.atualizaPrioridadeTarefa(1, Prioridade.ALTA)); // Prioridade alterada
    assertFalse(gerenciador.atualizaDataVencimentoTarefa(1, LocalDate.of(2024, 2, 15))); // Data de vencimento não alterada
}
// tabela de decisão
@Test
void testAtualizaDataVencimentoTarefa_CasoValido() {
    gerenciador = new GerenciadorTarefas();
    LocalDate dataEsperada = LocalDate.of(1945, 7, 13);
    assertTrue(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 1
    assertEquals(dataEsperada, gerenciador.listarTarefas().get(0).getDataVencimento());
    
    dataEsperada = LocalDate.of(2020, 2, 29);
    assertTrue(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 2
    assertEquals(dataEsperada, gerenciador.listarTarefas().get(0).getDataVencimento());
}

@Test
void testAtualizaDataVencimentoTarefa_CasosInvalidos() {
    gerenciador = new GerenciadorTarefas();
    LocalDate dataEsperada = null;
    
    assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 3
    assertNull(gerenciador.listarTarefas().get(0).getDataVencimento());
    
    dataEsperada = LocalDate.of(2021, 2, 30);
    assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 3
    assertNull(gerenciador.listarTarefas().get(0).getDataVencimento());
    
    dataEsperada = LocalDate.of(2021, -2, 16);
    assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 4
    assertNull(gerenciador.listarTarefas().get(0).getDataVencimento());
    
    dataEsperada = LocalDate.of(2021, 14, 16);
    assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 5
    assertNull(gerenciador.listarTarefas().get(0).getDataVencimento());
    
    dataEsperada = LocalDate.of(2023, 5, -6);
    assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 6
    assertNull(gerenciador.listarTarefas().get(0).getDataVencimento());
    
    dataEsperada = LocalDate.of(2023, 5, 33);
    assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 7
    assertNull(gerenciador.listarTarefas().get(0).getDataVencimento());
    
    dataEsperada = LocalDate.of(1808, 5, 16);
    assertFalse(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 8
    assertNull(gerenciador.listarTarefas().get(0).getDataVencimento());
    
    dataEsperada = LocalDate.of(2025, 6, 18);
    assertTrue(gerenciador.atualizaDataVencimentoTarefa(0, dataEsperada)); // Caso de Teste 9
    assertEquals(dataEsperada, gerenciador.listarTarefas().get(0).getDataVencimento());

}
}