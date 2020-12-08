package player_Deck;

import java.util.Arrays;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}

		}
		printDeck(cards);
		System.out.println("-------------------------------------------");

		Card[] shuffledDeck = new Card[52];
		shuffledDeck = cards;

		shuffle(shuffledDeck);
		printDeck(shuffledDeck);

	
	System.out.println("Hello, Do you want to draw a card?  Y/N");
	
	
	
	}

	public static void printDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}

	public static Card[] shuffle(Card[] cards) {
		 Collections.shuffle(Arrays.asList(cards));
		 return cards;
	}

}
