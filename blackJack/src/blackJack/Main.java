package blackJack;

import java.util.Scanner;

public class Main {

	
	//TODO Computer Gegner
	public static void main(String[] args) {
		
		Cards cards = new Cards();
		Hand yourHand = new Hand("Player");
		Hand croupierHand = new Hand("Croupier");
		Scanner scanner = new Scanner(System.in);
		String goOn = "n";
		int croupierScore;
		int score;
		boolean bustPlayer = false;
		boolean bustCroupier = false;
		
		//Shuffle Cards
		cards.shuffleDeck();
		
		//First Move by the Croupier
		croupierHand.takeCard(cards);
		croupierScore = croupierHand.getHandValue();
		System.out.println("The Croupiers Score is: " + croupierScore);
		
		//Players Turn
		do {
			yourHand.takeCard(cards);
			score = yourHand.getHandValue();
			
			if(score > 21) {
				System.out.println("You bust!!");
				bustPlayer = true;
				break;
			}
			
			System.out.println("Your Score is: " + score);
			System.out.println("Do you want another Card? ");
			   
			goOn = scanner.next();
			
		} while(goOn.equals("y"));
		
		scanner.close();
		
	   
	    //Croupiers Turn
		do {
			croupierHand.takeCard(cards);
			croupierScore = croupierHand.getHandValue();
			
			if(croupierScore > 21) {
				System.out.println("Croupier busts: ");
				bustCroupier = true;
				break;
			}
			
			  
		} while(croupierScore < 17);
		
		//Result
		System.out.println("*******************************************************");
		if(bustPlayer && bustCroupier) {
			System.out.println("Draw: ");
		} else if(bustPlayer) {
			System.out.println("You losse: ");
		} else if(bustCroupier) {
			System.out.println("You win: ");	
		} else if(score > croupierScore) {
			System.out.println("You win: ");
		} else if (score < croupierScore){
			System.out.println("You loose: ");
		} else {
			System.out.println("Draw: ");
		}
		
		System.out.println("You have " + yourHand.getHandValue() + " Points");
		System.out.println("Croupier has " + croupierHand.getHandValue() + " Points");
		

	}

}
