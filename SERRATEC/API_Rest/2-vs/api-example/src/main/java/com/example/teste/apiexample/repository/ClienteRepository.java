package com.example.teste.apiexample.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.teste.apiexample.model.Cliente;

public class ClienteRepository {
    
    private ArrayList<Cliente> clientes;
	private Integer idAtual = 0;
	
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
