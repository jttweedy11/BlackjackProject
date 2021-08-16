package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Player {
	protected BlackJackHand playerHand;
	public Player() {
		this.playerHand = new BlackJackHand();
	}
	public void addToPlayerHands(Card card) {
		playerHand.addCard(card);
	}
	public BlackJackHand getPlayerHand() {
		return playerHand;
	}
	public void setPlayerHand(BlackJackHand playerHand) {
		this.playerHand = playerHand;
	}
	@Override
	public String toString() {
		return "Player [playerHand=" + playerHand + "]";
	}
	
}
