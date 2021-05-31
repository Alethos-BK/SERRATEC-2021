package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carro;
import com.example.demo.repository.CarroRepository;

@RestController
@RequestMapping("/api/carros")
public class CarroControllers {

	private CarroRepository _carroRepository = new CarroRepository();

	@GetMapping
	public ArrayList<Carro> obter(){
		
		return _carroRepository.obter();
	}
	
	@PostMapping
	public ResponseEntity<Carro> adicionar(@RequestBody Carro carro){
		var novoCarro = _carroRepository.adicionar(carro);
		
		return new ResponseEntity<>(novoCarro, HttpStatus.CREATED);
	
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Carro> atualizar(@RequestBody Carro carro){

		var novoCarro = _carroRepository.atualizar(carro);
		
		return new ResponseEntity<>(novoCarro, HttpStatus.CREATED);
	}
}
