package produto;

public class Produto {
    private String codigo;
	private ProdutosEnum descricao;
	private CategoriaProduto categoria;
	private Integer quantidadeEstoque;
	private Double valor;
    private Double valorTotalProduto;
    
    public Produto(){}

    public Produto(
        ProdutosEnum descricao
        // Integer quantidadeEstoque
        ){

        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valor = valor;
        this.valorTotalProduto = valorTotalProduto;
        }

    //#region Getters e Setters

    public String getCodigo() {
        return codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public ProdutosEnum getDescricao() {
        return descricao;
    }

    public void setDescricao(ProdutosEnum descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto(Double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }
    
    //#endregion

    //#region métodos

    public void tipoDeProduto(){

        switch (this.descricao) {

            case CONTROLEPS5: 
                this.codigo = "001";
                this.categoria = this.categoria.IMPORTADOS;
                this.valor = 499.99;
                this.quantidadeEstoque = 5;
                
                break;
            
            case CONSOLEPS5:
                this.codigo = "002";
                this.categoria = this.categoria.PROMOCAO;
                this.valor = 4199.90;
                this.quantidadeEstoque = 3;

                break;
            
            case CONSOLEPS4:
                this.codigo = "003";
                this.categoria = this.categoria.FRETEGRATIS;
                this.valor =  2564.05;
                this.quantidadeEstoque = 15;

                break;

            case CAMERASONY:
                this.codigo = "004";
                this.categoria = this.categoria.NACIONAIS;
                this.valor = 599.89;
                this.quantidadeEstoque = 50;

                break;

            case CONTROLEPS4:
                this.codigo = "005";
                this.categoria = this.categoria.NACIONAIS;
                this.valor = 299.0;
                this.quantidadeEstoque = 55;

                break;

            case NITENDOSWITCH:
                this.codigo = "006";
                this.categoria = this.categoria.PROMOCAO;
                this.valor = 2537.89;
                this.quantidadeEstoque = 4;

                break;
            
            case NITENDOWII:
                this.codigo = "007";
                this.categoria = this.categoria.IMPORTADOS;
                this.valor = 1299.99;
                this.quantidadeEstoque = 2;

                break;

            case XBOXONE:
                this.codigo = "008";
                this.categoria = this.categoria.PROMOCAO;
                this.valor = 2469.05;
                this.quantidadeEstoque = 26;

                break;

            case XBOXSERIES:
                this.codigo = "009";
                this.categoria = this.categoria.FRETEGRATIS;
                this.valor = 2899.90;
                this.quantidadeEstoque = 10;

                break;

            case FONEDEGATINHO:
                this.codigo = "010";
                this.categoria = this.categoria.IMPORTADOS;
                this.valor = 189.50;
                this.quantidadeEstoque = 100;

                break;

            default:
                break;
        }
    }
        
    

    //#endregion
}
