package produto;

public class Produto {
    private String codigo;
	private ProdutosEnum descricao;
	private CategoriaProduto categoria;
	private Integer quantidade;
	private Double valor;
	private Double desconto;
    private Double valorTotalProduto;
    
    public Produto(){}

    public Produto(
        ProdutosEnum descricao,
        Integer quantidade
        ){

        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valor = valor;
        this.desconto = desconto;
        this.valorTotalProduto = valorTotalProduto;
        }

    //#region Getters e Setters

    public String getCodigo() {
        return codigo;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
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
                break;
            
            case CONSOLEPS5:
                this.codigo = "002";
                this.categoria = this.categoria.PROMOCAO;
                this.valor = 4199.90;
                break;
            
            case CONSOLEPS4:
                this.codigo = "003";
                this.categoria = this.categoria.FRETEGRATIS;
                this.valor =  2564.05;
                break;

            case CAMERASONY:
                this.codigo = "004";
                this.categoria = this.categoria.NACIONAIS;
                this.valor = 599.89;
                break;

            case CONTROLEPS4:
                this.codigo = "005";
                this.categoria = this.categoria.NACIONAIS;
                this.valor = 299.0;
                break;

            case NITENDOSWITCH:
                this.codigo = "006";
                this.categoria = this.categoria.PROMOCAO;
                this.valor = 2537.89;
                break;
            
            case NITENDOWII:
                this.codigo = "007";
                this.categoria = this.categoria.IMPORTADOS;
                this.valor = 1299.99;
                break;

            case XBOXONE:
                this.codigo = "008";
                this.categoria = this.categoria.PROMOCAO;
                this.valor = 2469.05;
                break;

            case XBOXSERIES:
                this.codigo = "009";
                this.categoria = this.categoria.FRETEGRATIS;
                this.valor = 2899.90;
                break;

            case FONEDEGATINHO:
                this.codigo = "010";
                this.categoria = this.categoria.IMPORTADOS;
                this.valor = 189.50;
                break;

            default:
                break;
        }
    }

    //#endregion
}
