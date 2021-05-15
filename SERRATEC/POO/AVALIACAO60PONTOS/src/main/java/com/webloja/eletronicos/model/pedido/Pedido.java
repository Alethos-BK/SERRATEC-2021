package pedido;

import java.util.ArrayList;
import java.util.Date;

import cliente.Cliente;
import formaPagamento.FormaPagamento;
import produto.Produto;

public class Pedido {
    private Integer numero;
	private Date dataAbertura;
	private ArrayList<Produto> listaProdutos;
	private Cliente cliente;
	private Double valorFrete;
	private Double desconto;
	private FormaPagamento formasDePagamentos;
	private Double valorTotal;
    
    public Pedido(
        Integer numero,
		Date dataAbertura,
		Cliente cliente,
		FormaPagamento formasDePagamentos
    ){
        this.numero = numero;
        this.dataAbertura = new Date();
        this.listaProdutos = listaProdutos;
        this.cliente = cliente;
        this.valorFrete = valorFrete;
        this.desconto = desconto;
        this.formasDePagamentos = formasDePagamentos;
        this.valorTotal = valorTotal;
    }

    //#region Getters e Setters

    public Integer getNumero() {
        return numero;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public FormaPagamento getFormasDePagamentos() {
        return formasDePagamentos;
    }

    public void setFormasDePagamentos(FormaPagamento formasDePagamentos) {
        this.formasDePagamentos = formasDePagamentos;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    //#endregion

     //#region Métodos

    public void adicionarProdutos(Produto produto){
        this.listaProdutos.add(produto);
    }
}

