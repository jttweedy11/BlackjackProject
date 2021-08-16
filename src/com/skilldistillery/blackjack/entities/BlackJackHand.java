package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand {
	private List<Card> blackJackCards;
	
	public BlackJackHand() {
		this.blackJackCards = new ArrayList<Card>();
	}
	public int getHandTotal() {
		int total = 0;
		for(Card card : cards) {
			total += card.getValue();
		}
		return total;
	}
	public boolean blackJackCheck() {
		if(cards.size() == 2 && getHandTotal() == 21) {
			System.out.println("Congradulations! That is a BlackJack!");
			return true;
		}
		else {
			return false;
		}
	}
	public boolean bustCheck() {
		if(getHandTotal() > 21) {
			System.out.println("Ops, looks like a bust.");
			return true;
		}
		else {
			return false;
		}
	}
	public void clearHand() {
		this.blackJackCards = new ArrayList<Card>();
	}
	public List<Card> getBlackJackCards() {
		return blackJackCards;
	}
	public void setBlackJackCards(List<Card> blackJackCards) {
		this.blackJackCards = blackJackCards;
	}
	
}
