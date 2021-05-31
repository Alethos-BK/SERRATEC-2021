package com.serrafut.playercontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serrafut.excepetion.NotFoundPlayer;
import com.serrafut.model.Player;
import com.serrafut.repository.PlayerRepository;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	private PlayerRepository _playerRepository;
	
	@GetMapping
	public List<Player> obter(){
		return _playerRepository.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<Player> obterPlayer(@PathVariable(value = "id") Integer id) {
		return _playerRepository.obterPorID(id);
	}
	
	@PostMapping
	public ResponseEntity<Player> adicionar(@RequestBody Player player) {
		var atualizado = this._playerRepository.adicionar(player);
		return ReponseEntity<>(atualizado, HttpStatus.CREATED);
					
	}
	
	@PutMapping("/{id}")
	public Player atualizar(@PathVariable(value = "id") Integer id, @RequestBody Player player) {
		try {
		var atualizado = this._playerRepository.atualizar(player);
		return atualizado;
		}catch(NotFoundPlayer e) {
			return null;
		}
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Player> deletar(@PathVariable(value = "id") Integer id){
		var deletado = this._playerRepository.deletar(id);
	}
	
}
