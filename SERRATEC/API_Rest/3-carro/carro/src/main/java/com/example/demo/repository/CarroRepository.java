package com.example.demo.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;

import com.example.demo.model.Carro;

public class CarroRepository {
	
	private ArrayList<Carro> carros;
	private Long id = 0l;
	
	public CarroRepository() {
		this.carros = new ArrayList<Carro>();
	}
	
	public ArrayList<Carro> obter(){
		return this.carros;
	}
	
	public Carro adicionar(Carro carro){
		this.id++;
		carro.setId(this.id);
		this.carros.add(carro);
		
		return carro;
	}

	public Carro atualizar(Carro carroAtualizado) {
		var carro =this.carros.stream().filter(c -> c.getId() == carroAtualizado.getId()).findFirst();
	
		if(carro.isPresent()) {
			new InputMismatchException("carro nao encontrado");
		}
		this.carros.removeIf(c -> c.getId() == carroAtualizado.getId());
		
		this.carros.add(carroAtualizado);
		
		return carroAtualizado;
	}
}
