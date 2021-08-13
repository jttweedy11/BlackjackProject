package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class Dealing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealing d = new Dealing();
		d.run();
	}

	private void run() {
		Deck deck = new Deck();
		deck.shuffle();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many cards you would like");
		try {
			int num = input.nextInt();
			if (num > 52) {
				throw new InputMismatchException();
			}

			List<Card> hand = new ArrayList<>();
			int totalValue = 0;
			for (int i = 0; i < num; i++) {
				Card c = deck.dealCard();
				totalValue += c.getValue();
				hand.add(c);
			}
			printHandAndValue(hand, totalValue);
			int cont = 1;
			while(cont == 1) {
				input.nextLine();
				System.out.println("Would you like to stay or hit?");
				String ans = input.nextLine();
				if(ans.equalsIgnoreCase("hit")) {
					Card c = deck.dealCard();
					hand.add(c);
					totalValue += c.getValue();
					printHandAndValue(hand, totalValue);
					return;
				}
				else if(ans.equalsIgnoreCase("stand")) {
					printHandAndValue(hand, totalValue);
					cont = 0;
					break;
				}
				else {
					System.err.println("Invalid entry, please enter hit or stand.");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("This is not a valid number of cards");
		} finally {
			input.close();
		}
		
	}

	private void printHandAndValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("The total value of your hand is " + value);
	}

}
