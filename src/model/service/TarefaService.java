package model.service;

import model.entity.Status;
import model.entity.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class TarefaService {

    private static int id = 1;


    Set<Tarefa> listaTarefas = new HashSet<>();

    public void criarTarefa(){
        Tarefa tarefa = new Tarefa();
        tarefa.setId(id++);
        tarefa.setTitulo(IO.readln(" TITULO DA TAREFA; "));
        tarefa.setDescricao(IO.readln(" DESCRIÇÃO; "));
        tarefa.setStatus(Status.PENDENTE);
        listaTarefas.add(tarefa);
    }

    public void mostrarTarefas(){
        IO.println(listaTarefas);
    }

}
