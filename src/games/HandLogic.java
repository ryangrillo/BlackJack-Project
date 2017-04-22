package games;

public class HandLogic {
	
	public void Hand() {
		
		Deck deck = new Deck();
		deck.ShuffleCards();
		System.out.println("Player 1 has: ");
		System.out.println();
		
		System.out.println(deck.getDeck().get(0) + "\n");
		int playerMoveOne = deck.getDeck().get(0).getCardNumber().getValue();
		System.out.println("this :  " + playerMoveOne);
		System.out.println("removed: " + deck.getDeck().remove(0));
		System.out.println("new size is: " + deck.getDeck().size());
		System.out.println("cardNumber: " +  deck.getDeck().get(0));
		System.out.println();
		
		//deck.getDeck().remove(0);
		System.out.println("Comp has: ");
		System.out.println(deck.getDeck().get(0));
		deck.getDeck().remove(0);
		System.out.println(deck.getDeck().get(0) );
		deck.getDeck().remove(0);
		System.out.println("new size is: " +deck.getDeck().size());
		
		
		
	}
}
