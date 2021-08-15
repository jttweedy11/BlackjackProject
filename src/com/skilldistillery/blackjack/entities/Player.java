package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Player extends Hand{
	protected List<Card> cards;
	public Player() {
		this.cards = new ArrayList<Card>();
	}
	public void addCard(Card card) {
		cards.add(card);
	}
	public List<Card> getCards() {
		return cards;
	}
}
