import controller.controller.TarefaController;
import model.service.TarefaService;

void main() {
    TarefaService tarefaService = new TarefaService();

    TarefaController tarefaController =
            new TarefaController(tarefaService);

    tarefaController.criarTarefa();
}