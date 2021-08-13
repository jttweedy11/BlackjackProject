package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;

//*****************Comparitor*****************
//dealer is a type of player, but has a deck of cards they deal from as well. Extend player class.
public class BlackJackApp {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackJackApp b = new BlackJackApp();
		b.launch();
	}
	public void launch() {
		presentMenu();
		String play = input.nextLine();
		if(play.equalsIgnoreCase("yes")) {
			System.out.println("Lets play!");
		}
	}
	public void presentMenu() {
		System.out.println("** Welcome to the BlackJack App!");
		System.out.println("** Would you like to play?");
	}
}
