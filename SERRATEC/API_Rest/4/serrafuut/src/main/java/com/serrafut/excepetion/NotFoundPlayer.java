package com.serrafut.excepetion;

public class NotFoundPlayer extends Exception{

	public NotFoundPlayer() {
		super("Jogador não encontrado");
	}

	public NotFoundPlayer(String message) {
		super(message);
	}
	
	
}
