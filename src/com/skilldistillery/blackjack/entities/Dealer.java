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
			System.out.println("Would you like to hit or stand?");
			String resp = input.nextLine();
			if(resp.equalsIgnoreCase("stand")) {
				System.out.println("You are standing with a " + pHand.getHandTotal());
				cont = 0;
			}
			else if(resp.equalsIgnoreCase("hit")) {
				Card c = deck.removeCard();
				pHand.addCard(c);
				System.out.println("The dealer has delt you a " + c);
				System.out.println("Your total is now " + pHand.getHandTotal());
			}
			if(pHand.getHandTotal()>21) {
				System.out.println("Ouch! " + pHand.getHandTotal() + " is a bust. The dealer wins. Better luck next time!");
			}
		}
	}
	public void dealerMoves() {
		if(pHand.getHandTotal()< 22) {
			System.out.println("The dealers cards are:");
			for(Card c : dHand.getHand()) {
				System.out.println(c);
			}
			System.out.println("The dealer has a total of " + dHand.getHandTotal());
			while(dHand.getHandTotal() < 17) {
				Card c = deck.removeCard();
				dHand.addCard(c);
				System.out.println("The dealer has delt a " + c + " to the dealer hand");
				System.out.println("The dealer hand now has a total of " + dHand.getHandTotal());
			}
			if(dHand.getHandTotal() > 21) {
				System.out.println("The dealer has busted! You win!");
			}
		}
	}
	public void pickWinner() {
		int pTotal = pHand.getHandTotal();
		int dTotal = dHand.getHandTotal();
		if(pTotal < 22 && dTotal < 22) {
			if(pTotal == dTotal) {
				System.out.println("It is a push! Both players had the same " + pTotal);
			}
			else if(pTotal > dTotal) {
				System.out.println("Congradulations, you win with " + pTotal);
			}
			else {
				System.out.println("Unfortunately, it appears you have lost to a " + dTotal);
				System.out.println("Better luck next time!");
			}
		}
	}

	public BlackJackHand getpHand() {
		return pHand;
	}

	public void setpHand(BlackJackHand pHand) {
		this.pHand = pHand;
	}

	public BlackJackHand getdHand() {
		return dHand;
	}

	public void setdHand(BlackJackHand dHand) {
		this.dHand = dHand;
	}
	
}
