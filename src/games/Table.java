package games;
import java.util.Scanner;

public class Table {
	
	public void start() {
		Scanner kb = new Scanner(System.in);
		Player one = new Player("PlayerOne");
		Player comp = new Player("Computer");
		System.out.println("Welcome " + one.getName() + " You are playing against " + comp.getName() + "\n");
		Deck d = new Deck();
		d.createDeck();
		d.ShuffleCards();
		Card c = d.getCard();
		System.out.println("C " + c);
		System.out.println(c.getCardNumber().getValue());
		one.addCard(d.getCard());
		one.addCard(d.getCard());
		comp.addCard(d.getCard());
		comp.addCard(d.getCard());
		int compTotal = 0;
		int oneTotal = 0;
		for (Card card : comp.getPlayerHand()) {
			System.out.println("Computer: " + card);
			compTotal = compTotal + card.getCardNumber().getValue();
		}
		System.out.println("Comp Total: " + compTotal);
		for (Card card : one.getPlayerHand()) {
			System.out.println("Player: " + card);
			oneTotal = oneTotal + card.getCardNumber().getValue();
		}
		System.out.println("Player Total: " + oneTotal);
		
		
		
		
		
//		Deck deck = new Deck();
//		deck.ShuffleCards();
//	 
//		System.out.println("Player 1");
		//System.out.println(deck.getCard(deck));
//		deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
//		deck.getCard();
//		deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
		
		
//		int playerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
//	    System.out.println(deck.getDeck().remove(0));//removes card from deck
//		int playerCardValueCardTwo = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
//		System.out.print(deck.getDeck().remove(0) + "\n\n");
//		System.out.println("playercardvalue: " + playerCardValueCardOne);
		
		System.out.println("Computer:");
//		Integer computerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
//	    System.out.print(deck.getDeck().remove(0) + "\n");//removes card from deck
//		Integer computerCardValueCardTwo = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it 
//		System.out.println(deck.getDeck().remove(0) + "\n");

//		int playerTotal = playerCardValueCardOne + playerCardValueCardTwo;
//		int compTotal = computerCardValueCardOne + computerCardValueCardTwo;
		
//		System.out.println("Player  1 you have a total of " + playerTotal + "points");
//		System.out.println("Computer has a total of " + compTotal + "points");
//		
//		
//		
//		while (playerTotal <= 56 && compTotal <= 56) {
//			System.out.println("would you like to (h)it or (s)stay");
//			String hitOrStay = kb.next();
//			if (hitOrStay.equals("h")) {
//				System.out.println(deck.getDeck().remove(0));
//				System.out.println("new total: " + (playerTotal + deck.getDeck().get(0).getCardNumber().getValue()));
//			}
//		}
		
		
		//System.out.println(deck.getDeck().size()+ "is the size now of the deck");
		
		}
	}
