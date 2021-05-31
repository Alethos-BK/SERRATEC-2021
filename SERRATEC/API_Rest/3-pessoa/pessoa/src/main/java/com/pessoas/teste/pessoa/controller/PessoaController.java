package com.pessoas.teste.pessoa.controller;

import java.util.ArrayList;

import com.pessoas.teste.pessoa.model.Pessoa;
import com.pessoas.teste.pessoa.repository.PessoaRepository;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    
    private PessoaRepository _pessoaRepository = new PessoaRepository();
    // @Autowired
    // PessoaRepository _pessoaRepository;

    @GetMapping
    public ArrayList<Pessoa> obter(){

        return _pessoaRepository.obter();
    }

    @PostMapping
    public ResponseEntity<Pessoa> adicionar(@RequestBody Pessoa pessoa){

        var novaPessoa = _pessoaRepository.adicionar(pessoa);

        return new ResponseEntity<>(novaPessoa, HttpStatus.CREATED);

    }
}
