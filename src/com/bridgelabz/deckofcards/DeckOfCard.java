package com.bridgelabz.deckofcards;

import java.util.Random;

public class DeckOfCard {
	String[][] card = new String[4][13];

	public void shuffle() {
		Random random = new Random();
		int rand1, rand2, rand3, rand4;
		String temp;
		for (int i = 0; i < 100; i++) {
			rand1 = random.nextInt(4);
			rand2 = random.nextInt(12);
			rand3 = random.nextInt(4);
			rand4 = random.nextInt(12);

			if (card[rand1][rand2] != card[rand3][rand4]) {
				temp = card[rand1][rand2];
				card[rand1][rand2] = card[rand3][rand4];
				card[rand3][rand4] = temp;
			}
		}
	}

	private void displayPlayerCard() {

		int n = 8;
		for (int i = 0; i < 4; i++) {
			System.out.print("Player " + (i + 1) + ": [ ");
			for (int j = 0; j < 8; j++) {

				System.out.print(card[i][j] + " ,");
			}
			System.out.println(card[i][n] + " ]");
		}
	}

	public static void main(String[] args) {
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		DeckOfCard deckOfCard = new DeckOfCard();
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deckOfCard.card[i][j] = suit[i] + rank[j];
			}
		}
		deckOfCard.shuffle();
		deckOfCard.displayPlayerCard();
	}
}