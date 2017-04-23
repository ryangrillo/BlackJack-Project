package games;
import java.util.Scanner;

public class Table {
	
	public void start() {
		Scanner kb = new Scanner(System.in);
		//boolean keepPlaying = true;
		Deck deck = new Deck();
		deck.ShuffleCards();
		Player one = new Player("PlayerOne");
		Player comp = new Player("Computer");
		System.out.println("Welcome " + one.getName() + " You are playing against " + comp.getName() + "\n");
	 
		System.out.println("Player 1");
		Integer playerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
	    System.out.println(deck.getDeck().remove(0));//removes card from deck
		Integer playerCardValueCardTwo = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
		System.out.print(deck.getDeck().remove(0) + "\n\n");
		
		System.out.println("Computer:");
		Integer computerCardValueCardOne = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it as int
	    System.out.print(deck.getDeck().remove(0) + "\n");//removes card from deck
		Integer computerCardValueCardTwo = deck.getDeck().get(0).getCardNumber().getValue(); //takes card value and store it 
		System.out.println(deck.getDeck().remove(0) + "\n");

		int playerTotal = playerCardValueCardOne + playerCardValueCardTwo;
		int compTotal = computerCardValueCardOne + computerCardValueCardTwo;
		
		System.out.println("Player  1 you have a total of " + playerTotal + "points");
		System.out.println("Computer has a total of " + compTotal + "points");
		
		
		System.out.println("would you like to (h)it or (s)stay");
		String hitOrStay = kb.next();
		
		
		//System.out.println(deck.getDeck().size()+ "is the size now of the deck");
		
		}
	}
