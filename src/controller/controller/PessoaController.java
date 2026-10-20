package controller.controller;

import model.service.PessoaService;

public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public void criarPessoa() {
        pessoaService.criar();
        IO.println("Criado com sucesso!!!");
    }
}