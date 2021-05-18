package pedido;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import cliente.Cliente;
import formaPagamento.FormaPagamento;
import produto.CategoriaProduto;
import produto.Produto;
import produto.ProdutosEnum;

public class Pedido {
    private Integer numero;
	private String dataAbertura;
	private ArrayList<Produto> listaProdutos;
	private Cliente cliente;
	private Double valorFrete;
	private Double desconto;
	private FormaPagamento formasDePagamentos;
	private Double valorTotal;
    
    public Pedido(
        Integer numero,
		String dataAbertura,
		Cliente cliente,
		FormaPagamento formasDePagamentos
    ){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.listaProdutos = new ArrayList<Produto>();
        this.cliente = cliente;
        this.valorFrete = 0.0;
        this.desconto = desconto;
        this.formasDePagamentos = formasDePagamentos;
        this.valorTotal = 0.0;

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

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
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
    
    public Double calcularValorTotal(){
        
        for (Produto produto : listaProdutos) {
            
            produto.tipoDeProduto();
            categoriaProduto(produto);

                this.valorTotal += produto.getValor() - this.desconto + this.valorFrete;

            }
            return this.valorTotal;
        }
   
    public void mostrarPedidos(){
            for (Produto produto : listaProdutos) {
                System.out.printf("Codigo %s Descrição: %s Valor total: %s \n", produto.getCodigo(), produto.getDescricao().getProdutos(), produto.getValor());
            }
        }
   
    public void categoriaProduto(Produto produto){
           
            if(produto.getCategoria() == CategoriaProduto.PROMOCAO){
                this.desconto = produto.getValor()* 0.1; 
                this.valorFrete = 27.0;
            }
            else if(produto.getCategoria() == CategoriaProduto.FRETEGRATIS){
                this.desconto = 0.0;
                this.valorFrete = 0.0;
            }
            else{
                this.desconto = 0.0;
                this.valorFrete = 27.0;
            }
        }
        
    public void mostarValores(){
                System.out.printf("Desconto: %s Frete: %s Valor Total: %s \n", this.desconto, this.valorFrete, new DecimalFormat("#, ##0.00").format(this.valorTotal));   
    }

    public void estoque(){
        for (Produto produto : listaProdutos) {
            switch (produto.getDescricao()) {
               
                case CONTROLEPS5:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);                    
                    break;

                case CONSOLEPS5:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;

                case CONSOLEPS4:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;

                case CAMERASONY:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;
                
                case CONTROLEPS4:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;
                
                case NITENDOSWITCH:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;

                case NITENDOWII:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;

                case XBOXONE:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;
                
                case XBOXSERIES:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;

                case FONEDEGATINHO:
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - 1);
                    break;
            }
            
            

        }
    }

    
}


