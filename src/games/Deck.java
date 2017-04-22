package games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<>(52);

	public void ShuffleCards() {

		for (Suit s : Suit.values()) {
			for (CardNumber r : CardNumber.values()) {
				deck.add(new Card(r, s));
			}
		}
		Collections.shuffle(deck);
		
		//for (Card card : deck) {
			//System.out.println(card);
		//}
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
}
