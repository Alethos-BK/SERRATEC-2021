package model.produto;

public class Produto {

    //#region Atributos

    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private double valor;
    private double desconto;
    private double acrescimo;
    private double valorTotal;

    //#endregion

    //#region Construtores
    public Produto(
        int id,
        String nome,
        String descricao,
        int quantidade,
        double valor,
        double desconto,
        double acrescimo
    ){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
        this.desconto = desconto;
        this.acrescimo = acrescimo;
        this.valorTotal = valorTotal();

    }

    //#endregion

    //#region Getters e Setters

    public int getId(){
        return this.id;
    }
   
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getDesconto(){
        return this.desconto;
    }
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public double getAcrescimo(){
        return this.acrescimo;
    }
    public void setAcrescimo(double acrescimo){
        this.acrescimo = acrescimo;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    //#endregion

    //#region Métodos
    public double valorTotal(){
                
        this.valorTotal = this.valor - (this.valor * this.desconto) + this.acrescimo;
        return this.valorTotal;
    }


}
