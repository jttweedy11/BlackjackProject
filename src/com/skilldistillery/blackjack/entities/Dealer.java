package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer extends Player {
	private Player pl1;
	private Deck deck;
	private BlackJackHand pHand;
	private BlackJackHand dHand;
	private List<Card> cards;

	public Dealer(Player pl1) {
		this.pl1 = pl1;
		this.pHand = pl1.getPlayerHand();
		this.deck = new Deck();
		this.dHand = new BlackJackHand();
	}

	public void shuffleDeck() {
		deck.shuffle();
	}

	public void dealFirstCard() {
		Card c = deck.removeCard();
		pHand.addCard(c);
		System.out.println("The dealer has delt you a " + c);
		dHand.addCard(deck.removeCard());
		System.out.println("The dealer has delt a card to their hand");
	}
	public void dealSecond() {
		Card c = deck.removeCard();
		pHand.addCard(c);
		System.out.println("The dealer has delt you a " + c);
		Card d = deck.removeCard();
		dHand.addCard(d);
		System.out.println("The dealer is showing " + d);
		System.out.println("Your total is " + pHand.getHandTotal());
	}
	public void checkBlackJack() {
		if(dHand.getHandTotal() == 21 && pHand.getHandTotal() != 21) {
			System.out.println("The dealer has wins with BlackJack");
		}
	}
	public void playerMoves() {
		Scanner input = new Scanner(System.in);
		int cont = 1;
		while(cont == 1 && pHand.getHandTotal() < 21) {
			System.out.println("Would you like to hit or stay?");
			String resp = input.nextLine();
			if(resp.equalsIgnoreCase("hit")) {
				Card c = deck.removeCard();
				pHand.addCard(c);
				System.out.println("The dealer has delt you a " + c);
				System.out.println("Your total is now " + pHand.getHandTotal());
			}
			else if (pHand.bustCheck()) {
				System.out.println("Ouch, you bust! I guess the dealer wins..");
			}
		}
	}
}
