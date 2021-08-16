package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

//*****************Comparitor*****************
//dealer is a type of player, but has a deck of cards they deal from as well. Extend player class.
//I need a dealer
//I need a player
//determine rules of the game.
public class BlackJackApp {
	Scanner input = new Scanner(System.in);
	Player p = new Player();
	Dealer d = new Dealer(p);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackJackApp b = new BlackJackApp();
		b.launch();
	}
	public void launch() {
		presentMenu();
		d.shuffleDeck();
		d.dealFirstCard();
		d.dealSecond();
		d.checkBlackJack();
		d.playerMoves();
		}
	public void presentMenu() {
		System.out.println("** Welcome to the BlackJack App!");
		System.out.println("** Lets play!");
	}
}
