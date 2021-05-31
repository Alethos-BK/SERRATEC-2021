package com.serrafut.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.serrafut.excepetion.NotFoundPlayer;
import com.serrafut.model.Player;

@Repository
public class PlayerRepository {
	
	private LinkedList<Player> players = new LinkedList<Player>();
	private Integer id = 0;
	
	public List<Player> obterTodos(){
		return this.players;
	}
	
	public Optional<Player> obterPorID(Integer id) {
		return this.players.stream().filter(p -> p.getId() == id).findFirst();
		
	}

	public Player adicionar(Player player) {
		this.id++;
		player.setId(id);
		this.players.add(player);
		
		return player;
	}
	
	public Player atualizar(Player playerAtt) throws NotFoundPlayer {
		
		this.deletarPlayer(playerAtt.getId());
		
		this.players.add(playerAtt);
		
		return playerAtt;
	}
	
	public void deletar(Integer idPlayer) throws NotFoundPlayer {
		this.deletarPlayer(idPlayer);
		
	}
	
	private void deletarPlayer(Integer idJogador) throws NotFoundPlayer {
		var player = this.obterPorID(idJogador);
		
		if(player.isEmpty()) {
			throw new NotFoundPlayer();
		}
		
		this.players.removeIf(p -> p.getId() == idJogador);
	}
}
