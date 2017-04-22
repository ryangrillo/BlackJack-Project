package games;

import java.util.ArrayList;

public class HandLogic {
	
	public <List>ArrayList<Integer> dealHandPlayerOne() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deck deck = new Deck();
		deck.ShuffleCards();
		System.out.println(deck.getDeck().get(0) + "\n"); //shows card off top of deck
		Integer playerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
		System.out.println(deck.getDeck().remove(0));//removes card from deck
		
		System.out.println(deck.getDeck().get(0) + "\n"); //shows card off top of deck
		Integer playerCardValueCardTwo = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
		System.out.println(deck.getDeck().remove(0));//removes card from deck
		
		list.add(playerCardValueCardOne);//adds players first card to Arraylist
		list.add(playerCardValueCardTwo);//adds players first card to Arraylist	
		
		return list;
		
		
		
//		//deck.getDeck().remove(0);
//		System.out.println("Comp has: ");
//		System.out.println(deck.getDeck().get(0));
//		deck.getDeck().remove(0);
//		System.out.println(deck.getDeck().get(0) );
//		deck.getDeck().remove(0);
//		System.out.println("new size is: " +deck.getDeck().size());
		
		
		
	}
}
