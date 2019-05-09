package blackJack;

import java.util.ArrayList;
import java.util.Collections;


public class Cards extends ArrayList<Card>{

	private static final long serialVersionUID = 1L;
	
	
	String[] cardTyps = {"Hearts", "Tiles", "Clovers", "Pikes"};
	String[] cardNames = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
    //Construktor
	public Cards() {
	  for(String cardTyp  : cardTyps) {
		for(String cardName : cardNames) {
			this.add(new Card(cardTyp, cardName));	
		}
	  }
	}
	
	//Shuffles Cards
	public void shuffleDeck() {
		Collections.shuffle(this);
	}	

}
