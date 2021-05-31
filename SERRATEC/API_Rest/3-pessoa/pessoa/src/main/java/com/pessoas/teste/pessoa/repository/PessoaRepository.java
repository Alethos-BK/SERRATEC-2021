package com.pessoas.teste.pessoa.repository;

import java.util.ArrayList;
import java.util.Optional;

import com.pessoas.teste.pessoa.model.Pessoa;

public class PessoaRepository {
    
    private ArrayList<Pessoa> pessoas;
    private Long id = 0l;

    public PessoaRepository(){
        this.pessoas = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> obter(){
        return this.pessoas;
    }

    public Optional<Pessoa> obter(Integer id){
        return this.pessoas.stream().filter(p -> p.getId() = id).findFirst();
    }

    public Pessoa adicionar(Pessoa pessoa){
        this.id++;
        pessoa.setId(id);
        this.pessoas.add(pessoa);

        return pessoa;
    }
}
