package controller.controller;

import model.service.TarefaService;

public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    public void criarTarefa() {
        tarefaService.criar();
    }
}