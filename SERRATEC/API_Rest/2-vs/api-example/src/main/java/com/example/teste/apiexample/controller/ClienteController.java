package com.example.teste.apiexample.controller;

import java.util.List;

import com.example.teste.apiexample.model.Cliente;
import com.example.teste.apiexample.repository.ClienteRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    private ClienteRepository _repositorioCliente = new ClienteRepository();

    @GetMapping
	public List<Cliente> obter(){
		
		return _repositorioCliente.obter();
	}
	
	// @PostMapping
	// public Cliente adicionar(@RequestBody Cliente cliente) {
		
	// 	return _repositorioCliente.adicionar(cliente);
	// }

    @PostMapping
    public ResponseEntity<Cliente> adicionar(@RequestBody Cliente cliente){

        var clienteAdicionado = _repositorioCliente.adicionar(cliente);

        return new ResponseEntity<>(clienteAdicionado, HttpStatus.CREATED);
    }
}
 

