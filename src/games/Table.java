package games;

import java.util.ArrayList;
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
		//Card c = d.getCard();
		// System.out.println("C " + c);
		// System.out.println(c.getCardNumber().getValue());

		boolean keepPlaying = true;
		while (keepPlaying) {
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
			
			boolean keepPlayingHand = true;
			while (keepPlayingHand) {
				System.out.print(one.Name + "Would you like to (h)it or(s)tay: ");
				oneTotal = 0;
				String hitOrStay = kb.nextLine();
				if (hitOrStay.equals("h")) {
					one.addCard(d.getCard());
					for (Card card : one.getPlayerHand()) {
						System.out.println("Player gets: " + card);
						oneTotal = oneTotal + card.getCardNumber().getValue();
					}
					System.out.println(one.Name + " you have " + oneTotal + "points");
					System.out.println(comp.Name + " has " + compTotal + " points");
					if (oneTotal > 21) {
						System.out.println("You lost!");
						System.out.println("You bust");
						keepPlayingHand = false;
						oneTotal = 0;
						compTotal = 0;
						one.setPlayerHand(new ArrayList<Card>());
						comp.setPlayerHand(new ArrayList<Card>());
					}
				} else {
					while (compTotal < 17) {
						compTotal = 0;
						comp.addCard(d.getCard());
						for (Card card : comp.getPlayerHand()) {
							//System.out.println("Comp: " + card);
							compTotal = compTotal + card.getCardNumber().getValue();
						}
						System.out.println();
						//System.out.println("Comp Total: " + compTotal);
					}
					for (Card card : one.getPlayerHand()) {
						oneTotal = oneTotal + card.getCardNumber().getValue();
					}
					//System.out.println(comp.getPlayerHand());
					System.out.println(comp.Name + " has " + compTotal + " points");
					// call checkForWin method pass in oneTotal and compTotal
					if (compTotal > 21) {
						System.out.println("You win!");
						keepPlayingHand = false;
					} else {
						checkForWin(oneTotal, compTotal);
						keepPlayingHand = false;
					}
				}

			}
			oneTotal = 0;
			compTotal = 0;
			one.setPlayerHand(new ArrayList<Card>());
			comp.setPlayerHand(new ArrayList<Card>());
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

		}
	}

	public void checkForWin(int playerTotal, int compTotal) {
		System.out.println(playerTotal);
		System.out.println(compTotal);
		if (playerTotal > compTotal) {
			System.out.println("Player 1 wins this hand");
		} else if (playerTotal == compTotal) {
			System.out.println("You push");
		} else {
			System.out.println("computer wins");
		}
	}
}
