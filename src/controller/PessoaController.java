package controller;

import model.service.PessoaService;

public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }


    // creat C
    public void criarPessoa() {
        pessoaService.criar();
        IO.println("CRIAÇÃO REALIZADA ");
    }

    //read R
    public void mostarPessoas() {
        pessoaService.mostarPessoas();
    }

}