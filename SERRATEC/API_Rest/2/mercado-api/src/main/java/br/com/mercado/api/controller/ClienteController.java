package br.com.mercado.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercado.api.model.Cliente;
import br.com.mercado.api.repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	//variavel privada _
	private ClienteRepository _repositorioCliente = new ClienteRepository();
	
	@GetMapping
	public List<Cliente> obter(){
		
		return _repositorioCliente.obter();
	}
	
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		
		return _repositorioCliente.adicionar(cliente);
	}
}
