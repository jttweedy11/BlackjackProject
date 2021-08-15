package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Hand {
		protected Deck deck = new Deck();
		protected List<Card> cards;
		public Dealer() {
			deck.shuffle();
			cards = new ArrayList<Card>();
		}
		public Card dealCard() {
			Card c = deck.dealCard();
			return c;
		}
		@Override
		public void addCard(Card card) {
			cards.add(card);
		}
}
