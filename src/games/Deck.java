package games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	 List<Card> deck = new ArrayList<>(52);
	
	public Card getCard() {
		return deck.remove(0);
	}
	public void ShuffleCards() {
		Collections.shuffle(deck);
	}
	public void createDeck(){
		for (Suit s : Suit.values()) {
			for (CardNumber r : CardNumber.values()) {
				deck.add(new Card(r, s));
			}
		}
		
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
}
