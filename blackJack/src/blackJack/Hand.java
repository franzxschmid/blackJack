package blackJack;

import java.util.ArrayList;

public class Hand extends ArrayList<Card>{
	
    // Static Variable Decleration
	private static final long serialVersionUID = 1L;
	
	// Instance Variable Decleration
	private int value;
	private String owner;
	
	// Chained Constructor
	public Hand() {
		this("CPU");
	}
	
	public Hand(String owner) {
		this.value = 0;
	}
	
	// Getter
	public int getHandValue() {
		return this.value;
	}

	// Setter
	public void setHandValue(Card newCard) {
		newCard.setCardValue(owner);
		this.value += newCard.getCardvalue();
	}
	
	// Method to take a new Card
	public void takeCard(Cards cards) {
		
		Card newCard = cards.remove(0);
		this.setHandValue(newCard);
		this.add(newCard);
	}

	
}
