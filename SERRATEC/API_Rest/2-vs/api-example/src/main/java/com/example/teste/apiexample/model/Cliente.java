package com.example.teste.apiexample.model;

public class Cliente {
    private Integer id;
    private String nome;
    private Integer idade;

    public Cliente(){}

    public Integer getId() {
        return id;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    
}
