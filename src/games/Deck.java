package games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	 List<Card> deck = new ArrayList<>(52);
	
	public Card getCard() {
//		Card givenCard = getDeck().get(0); //takes card value and store it as int
//		System.out.println(getDeck().get(0));
//		System.out.println(getDeck().remove(0) + " is removed");
//		System.out.println("size is " + getDeck().size());
//		System.out.println();getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
		
//		System.out.println(deck.remove(0));
	    
		return deck.remove(0);
		
	}

	public void ShuffleCards() {

		Collections.shuffle(deck);
		
		//for (Card card : deck) {
			//System.out.println(card);
		//}
	}
	
	public void createDeck(){
		for (Suit s : Suit.values()) {
			for (CardNumber r : CardNumber.values()) {
				deck.add(new Card(r, s));
			}
		}
		
	}

	public List<Card> getDeck() {
//		Collections.shuffle(deck);
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	
}
