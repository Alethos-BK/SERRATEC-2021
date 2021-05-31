package br.com.mercado.api.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.mercado.api.model.Produto;

public class ProdutoRepository {

	private ArrayList <Produto> listaProdutos;
	private Integer ultimoID = 1;
	
	public ProdutoRepository() {
		this.listaProdutos = new ArrayList<Produto>();
		this.listaProdutos.add(new Produto(1, "computador", 10, 2500.0));
	}
	public List<Produto> obter(){
		return this.listaProdutos;
	}

	public Optional<Produto> obter(Integer id) {
		return this.listaProdutos.stream().filter(p -> p.getId() == id).findFirst();
	}
	
	
	public Produto adicionar(Produto produto) {
		this.ultimoID++;
		produto.setId(ultimoID);
		
		this.listaProdutos.add(produto);
		return produto;
	}
}
