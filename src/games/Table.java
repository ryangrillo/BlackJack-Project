package games;

public class Table {
	
	public void start() {
		Menu m = new Menu();
		m.menuDisplay();
		m.makeSelection();
		
	Deck deck = new Deck();
	deck.displayShuffledCards();
	System.out.println(deck.getDeck().get(51));
	deck.getDeck().get(50);
//	deck.getDeck().get(49);
//	deck.getDeck().get(48);
//	deck.getDeck().get(47);
//	deck.getDeck().get(40);
	System.out.println(deck.getDeck().size());
}
}