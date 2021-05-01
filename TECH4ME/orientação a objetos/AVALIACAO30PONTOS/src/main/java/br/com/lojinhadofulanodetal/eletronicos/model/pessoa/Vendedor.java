package model.pessoa;

import model.pedido.Pedido;

public class Vendedor extends Pessoa{
    
    private double comissao;
    private Pedido pedido;
    private double valorTotalComissao;

    //#region Construtores
    public Vendedor( int id,
    String nome,
    String email,
    String cpfOuCnpj)
    {
    this.nome = nome;
    this.email = email;
    this.cpfOuCnpj = cpfOuCnpj;
    this.comissao = 0.05;
    this.pedido = pedido;
    this.valorTotalComissao = valorTotalComissao;
    }
    //#endregion

    public double getComissao(){
        return this.comissao;
    }

    public double getValorTotalComissao(){
        return this.valorTotalComissao;
    }
    
    //#region Métodos
    public double calcularComissao(Double valor){
        this.valorTotalComissao = valor * this.comissao;
        
        return this.valorTotalComissao;
    }

}
