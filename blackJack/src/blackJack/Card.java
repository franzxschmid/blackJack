package blackJack;
import java.util.Scanner;

public class Card{
	
	// Instance Variable Decleration
	private String cardTyp;
	private String cardName;
	private int cardValue;
	
	// Coonstructor
	public Card(String cardTyp, String cardName){
		this.cardTyp = cardTyp;
		this.cardName = cardName;
	}
	
	// Getter for CardValue
	public int getCardvalue() {
		return cardValue;
	}
	
	// Setter for CardValue
    public void setCardValue(String owner) {
    	
    	if(this.cardName == "Ace" && owner == "Player") {
    	
    		@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
        	String aceValue = "no";		
        		
            System.out.println("You got an Ace, do you want to count it, one or eleven Points ");
            aceValue = scanner.next();
        		
        	if(aceValue == "y") {
        		this.cardValue = 11;
        	}  else {
        		this.cardValue = 1;
        	}
        	
    	} else if(this.cardName == "Ace" && owner == "Croupier") {
    	
    		    this.cardValue = 11;
    		    
        } else if(this.cardName == "2") {
		        this.cardValue = 2;
        } else if(this.cardName == "3") {
		        this.cardValue = 3;
        } else if(this.cardName == "4") {
		        this.cardValue = 4;
        } else if(this.cardName == "5") {
		        this.cardValue = 5;
        } else if(this.cardName == "6") {
		        this.cardValue = 6;
        } else if(this.cardName == "7") {
		        this.cardValue = 7;
        } else if(this.cardName == "8") {
	            this.cardValue = 8;
        } else if(this.cardName == "9") {
	            this.cardValue = 9;
        } else {
        	    this.cardValue = 10;
        }
    }  	
    
}
