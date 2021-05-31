package br.com.mercado.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercado.api.model.Produto;
import br.com.mercado.api.repository.ProdutoRepository;

@RestController
public class ProdutoController {

	private ProdutoRepository  repositorioProduto= new ProdutoRepository();
	
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public List<Produto> obterTodos(){
		
		return this.repositorioProduto.obter();
	}
	
	@RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
	public Optional<Produto> obter(@PathVariable(value = "id") Integer id){
		
		return this.repositorioProduto.obter(id);
	}
	
	
	@RequestMapping(value = "/produtos", method = RequestMethod.POST)
	public Produto adicionar(@RequestBody Produto produto) {
		return this.repositorioProduto.adicionar(produto);
	}
}
