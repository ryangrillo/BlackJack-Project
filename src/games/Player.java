package games;

import java.util.ArrayList;
import java.util.List;

public class Player {
	String Name;
	
	List<Card> playerHand = new ArrayList<>();
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Player(String name) {
		Name = name;
	}

	public List<Card> getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(List<Card> playerHand) {
		this.playerHand = playerHand;
	}
	
	public void addCard(Card card){
		playerHand.add(card);
	}

}
