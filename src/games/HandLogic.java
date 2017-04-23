package games;

import java.util.ArrayList;

public class HandLogic {
	
	
	
	public  void/*<List>ArrayList<Integer>*/ dealACard() {
		Deck deck = new Deck();
		deck.ShuffleCards();
		Integer playerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		Integer playerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
//		System.out.println(deck.getDeck().remove(0));//removes card from deck
//		Integer playerCardValueCardTwo = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
//		System.out.println(deck.getDeck().remove(0));//removes card from deck
////		System.out.println("Value1: " +  deck.getDeck().get(0).getCardNumber());
////		System.out.println("Value2: " +  deck.getDeck().get(1).getCardNumber());
//		list.add(playerCardValueCardOne);//adds players first card to Arraylist
//		list.add(playerCardValueCardTwo);//adds players first card to Arraylist	
//		System.out.println("this is get deck" + deck.getDeck());
//		
//		Integer dealerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and stores it as int
//		System.out.println(deck.getDeck().remove(0));//removes card from deck
//		Integer dealerCardValueCardTwo = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and stores it as int
//		System.out.println(deck.getDeck().remove(0));//removes card from deck
//		list.add(dealerCardValueCardOne);//adds players first card to Arraylist
//		list.add(dealerCardValueCardTwo);//adds players first card to Arraylist
//	
//		
//		return list;
	}

	
	
}
