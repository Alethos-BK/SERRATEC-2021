package com.lojinha.namenotfound.model;

public class Cliente{
    
    public Long id;
    public String nome;
    public Integer idade;
    public String sexo;
    public String estadoCivil;
    public String profissao;
    public String cpfOuCnpj;

    public Cliente(){}

    public Cliente (String nome, Integer idade, String sexo, String estadoCivil, String profissao, String cpfOuCnpj){
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    this.estadoCivil = estadoCivil;
    this.profissao = profissao;
    this.cpfOuCnpj = cpfOuCnpj;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
}



