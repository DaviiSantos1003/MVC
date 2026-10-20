
package model.service;

import model.entity.Status;
import model.entity.TarefaEntity;

import java.util.HashSet;
import java.util.Set;

public class TarefaService {

    private static int id = 1;

    private final Set<TarefaEntity> bancoDeDados = new HashSet<>();

    public void criar() {
        TarefaEntity tarefa = new TarefaEntity();

        tarefa.setId(id++);
        tarefa.setTitulo(IO.readln("Digite o título da tarefa: "));
        tarefa.setDescricao(IO.readln("Digite a descrição da tarefa: "));

        IO.println("1 - Pendente");
        IO.println("2 - Em andamento");
        IO.println("3 - Concluída");

        String opcao = IO.readln("Digite o status: ");

        if (opcao.equals("1")) {
            tarefa.setStatus(Status.PENDENTE);
        } else if (opcao.equals("2")) {
            tarefa.setStatus(Status.EM_ANDAMENTO);
        } else if (opcao.equals("3")) {
            tarefa.setStatus(Status.CONCLUIDA);
        } else {
            throw new IllegalArgumentException("Status inválido!");
        }

        bancoDeDados.add(tarefa);

        IO.println("Tarefa criada com sucesso!");
    }
}
