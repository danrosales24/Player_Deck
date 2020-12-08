package player_Deck;

public class Card {

	private final int rank;
	private final int suit;

	public static final String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };
	public static final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;

	}

	// get methods
	public int getRank() {
		return this.rank;
	}

	public int getSuit() {
		return this.suit;
	}

	public String toString() {
		return ranks[this.rank] + " of " + suits[this.suit];
	}

	public boolean compareSame(Card x) {
		return this.rank == x.rank && this.suit == x.suit;

	}

	public int compareCard(Card x) {
		if (this.suit < x.suit) {
			return -1;
		}
		if (this.suit > x.suit) {
			return 1;
		}
		if (this.rank < x.rank) {
			return -1;
		}
		if (this.suit > x.suit) {
			return 1;
		}
		return 0;
	}

}
