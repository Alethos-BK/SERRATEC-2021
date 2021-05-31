package br.com.mercado.api.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.mercado.api.model.Cliente;

public class ClienteRepository {
	
	private ArrayList<Cliente> clientes;
	private Long idAtual = 0l;
	
	public ClienteRepository() {
		
		this.clientes = new ArrayList<Cliente>();
	}
	//devolver todos
	public List<Cliente> obter(){
		return this.clientes;
	}
	//adicionar
	public Cliente adicionar(Cliente cliente) {
		this.idAtual++;
		cliente.setId(idAtual);
		this.clientes.add(cliente);
		
		return cliente;
	}
}
