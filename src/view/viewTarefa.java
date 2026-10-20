package view;

import controller.TarefaController;
import model.service.TarefaService;

public class viewTarefa {
    static void main(){

        final TarefaService tarefaService =
                new TarefaService();
        final TarefaController tarefaController =
                new TarefaController(tarefaService);

        tarefaController.criandoTarefa();
    }
}