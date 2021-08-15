package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cards;
	public Hand() {
		cards = new ArrayList<Card>();
	}
	public void addCard(Card card) {
		cards.add(card);
	}
	public List<Card> getCards() {
		return cards;
	}
}