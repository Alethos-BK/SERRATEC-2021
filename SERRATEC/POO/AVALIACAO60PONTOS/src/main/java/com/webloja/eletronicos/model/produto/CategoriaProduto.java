package produto;

public enum CategoriaProduto {
    NACIONAIS("Produto Nacional: "),
	IMPORTADOS("Importados: "),
	PROMOCAO("Promocao: "),
	FRETEGRATIS("Frete Gratis: ");

    String tipo;

    private CategoriaProduto(String tipo) {
    }

    public String getCategoriaProduto(){
        return this.tipo;
    }
}
