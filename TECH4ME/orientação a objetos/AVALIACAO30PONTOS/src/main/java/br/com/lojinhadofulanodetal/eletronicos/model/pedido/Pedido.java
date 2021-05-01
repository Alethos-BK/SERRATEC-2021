package model.pedido;

import java.util.ArrayList;

import model.pessoa.Cliente;
import model.pessoa.Vendedor;
import model.produto.ListaDeProdutos;
import model.produto.Produto;

public class Pedido {

    //#region Atributos

    private int id;
    private String descricao;
    private Cliente cliente;
    private Vendedor vendedor;
    private Produto produto;
    private ArrayList<String>produtos;
    private ArrayList<Double>valorProdutos;
    private double acrescimo;
    private double desconto;
    private double valorTotal = 0.0;
    private ListaDeProdutos nomeProdutos;
    
    //#endregion

    //#region Construtores

    public Pedido(
    int id,
    String descricao,
    Cliente cliente,
    Vendedor vendedor,
    // ListaDeProdutos listaDeProdutos,
    double acrescimo
    ){
    
    this.id = id;
    this.descricao = descricao;
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.acrescimo = acrescimo;
    this.desconto = desconto;
    this.valorTotal = valorTotal;
    this.produto = produto;
    
    this.produtos = new ArrayList();
    this.valorProdutos = new ArrayList();
    }
    //#endregion

    //#region Getters e Setters

    public ArrayList<String> getProdutos() {
        return produtos;
    } 

    public int getId(){
        return this.id;
    }
   
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Vendedor getVendedor(){
        return this.vendedor;
    }

    public void setVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
    }

    public double getAcrescimo(){
        return this.acrescimo;
    }

    public void setAcrescimo(double acrescimo){
        this.acrescimo = acrescimo;
    }

    public double getDesconto(){
        return this.desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public ListaDeProdutos getNomeProduto(){
        return this.nomeProdutos;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    //#endregion

    //#region Métodos

    public void adicionarProdutos(String produtos){   
        this.produtos.add(produtos);
    }
    
    public void pegarValorProduto(Double valorproduto){
        this.valorProdutos.add(valorproduto);
    }

    public double calcularValorTotal(){
        
        for (double valorProduto : valorProdutos) {
            this.valorTotal += valorProduto;
        }
        if(this.valorTotal > 1000){
            this.desconto = 0.1;
            this.valorTotal = this.valorTotal - (this.valorTotal * this.desconto);
        }
        
        else{
            this.desconto = 0.05;
            this.valorTotal = this.valorTotal - (this.valorTotal * this.desconto);
        } return this.valorTotal;
      
    }

    public void pegarNomeProduto(){
     
        for (String produto : produtos) {
            System.out.println(produto);
            System.out.println("--------");
        }
    }

    public void mostrarPedidos(){
        System.out.println ("PEDIDO:\n ---------\nCliente: " + this.cliente.getNome() + "\nDescricao pedido: " + this.descricao + 
                            "\nVendedor: " + this.vendedor.getNome() + "\n\n Produtos: \n");
        pegarNomeProduto();

        System.out.println ("Acrescimo: R$" + this.acrescimo + "\nDesconto de: " + this.desconto * 100 + "%\nValor total: R$" + this.valorTotal + 
                            "\nComissão vendedor: R$" + this.vendedor.getValorTotalComissao());
        
        System.out.println ("Obrigada por realizar sua compra senhor: " + cliente.getNome());
        
        System.out.println("\n********************************************************************");
        
    }







}
