package com.pessoas.teste.pessoa.model;

public class Pessoa {
    private Long id;
    private String nome;
    private Integer idade;
    private Boolean souDev;
    
    public Long getId() {
        return id;
    }
    public Boolean getSouDev() {
        return souDev;
    }
    public void setSouDev(Boolean souDev) {
        this.souDev = souDev;
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
    public void setId(Long id) {
        this.id = id;
    }
}
