package controller;

import model.service.TarefaService;

public class TarefaController {

    private final TarefaService tarefaService;


    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    //criar C
    public void criandoTarefa() {
        tarefaService.criarTarefa();
        IO.println("TAREFA ATRIBUIDA!!");
    }

    //mostar R
    public void mostrarTarefa() {
        tarefaService.mostrarTarefas();
    }

}