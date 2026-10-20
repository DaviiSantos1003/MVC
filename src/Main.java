import controller.TarefaController;
import model.service.TarefaService;

void main() {

 /*   PessoaService pessoaService =
            new PessoaService();
    PessoaController pessoaController =
            new PessoaController(pessoaService);

pessoaController.criarPessoa();
*/


    TarefaService tarefaService=
            new TarefaService();
    TarefaController tarefaController =
            new TarefaController(tarefaService);

    tarefaController.criandoTarefa();



}