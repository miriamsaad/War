package weekSixFinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//hand (List of Card)
	List<Card> hand = new ArrayList<Card>();
	
	
	//score (set to 0 in the constructor)
	public int score = 0;
	
	
	//name field
	private String name;

	//getters and setters
	public int getScrore() {
		return score;
	}


	public void setScrore(int scrore) {
		this.score = scrore;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	//describe method (prints out information about the player and calls the describe method for each card in the Hand List)
	public void describePlayer() {
		System.out.println("Player's name is: " + name);
		
		for (int i = 0; i < hand.size(); i++) {
			Card thisCard = hand.get(i);
			thisCard.describeCard();
			
		}
	}
	
	//flip method (removes and returns the top card of the Hand)
	public Card flip() {
		
		Card topCard = hand.remove(0);
		
		return topCard;
	
}
	
	//draw method (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	public void playerDraw(Deck deck) {
		Card drawnCard = deck.draw();
		hand.add(drawnCard);
		
	}
	
	//incrementScore method (adds 1 to the Player’s score field)
	public void incrementScore() {
		score += 1;
	}
	
}


