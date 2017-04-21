package games;

public class Card {
	private CardNumber cardNumber;
	private Suit suit;
	
	
	public Card(CardNumber cardNumber, Suit suit) {
		this.cardNumber = cardNumber;
		this.suit = suit;
	}
	public CardNumber getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(CardNumber cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (cardNumber != other.cardNumber)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Card [cardNumber=");
		builder.append(cardNumber);
		builder.append(", suit=");
		builder.append(suit);
		builder.append("]");
		return builder.toString();
	}
}


