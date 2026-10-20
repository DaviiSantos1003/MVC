package model.service;

import model.entity.Pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PessoaService {

    private static int id =1;

    Set<Pessoa> bancoDeDados = new HashSet<>();

    public void criar(){
        Pessoa p = new Pessoa();
        p.setId(id++);
        p.setNome(IO.readln(" NOME; "));
        p.setEmail(IO.readln(" EMAIL; "));
        p.setSenha(IO.readln(" SENHA; "));
        bancoDeDados.add(p);
    }

    public void mostarPessoas(){
        IO.println(bancoDeDados);
    }

}
