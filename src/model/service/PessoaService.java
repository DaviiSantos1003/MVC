
package model.service;

import model.entity.PessoaEntity;

import java.util.HashSet;
import java.util.Set;

public class PessoaService {

    private static int id = 1;

    Set<PessoaEntity> bancoDeDados = new HashSet<>();

    // CRUD

    public void criar() {
        PessoaEntity p = new PessoaEntity();

        p.setId(id++);
        p.setNome(IO.readln("Digite seu nome: "));
        p.setEmail(IO.readln("Digite seu Email: "));
        p.setSenha(IO.readln("Digite sua Senha: "));

        bancoDeDados.add(p);
    }
}
