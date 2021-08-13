package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> d;
	public Deck() {
		d = createDeck();
	}
	public List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()) {
				deck.add(new Card(s,r));
			}
		}
		return deck;
	}
	public int getDeckSize() {
		return d.size();
	}
	public Card dealCard() {
		Card c = d.remove(0);
		return c;
	}
	public void shuffle() {
		Collections.shuffle(d);
	}
}
