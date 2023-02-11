package weekSixFinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {
	
	
	//card list
	List<Card> Cards = new ArrayList<Card>();
	
	//deck constructor
	public Deck() {
		createDeck();
	}
	
	public List<Card> createDeck() {
	
		
	int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};	
		
	String[] names = {"Diamonds", "Hearts", "Spades", "Clubs"};
	
	for (int i = 0; i < values.length; i++) {
		for (int j = 0; j < names.length; j++) {
			Card card1 = new Card(values[i], names[j]);
			Cards.add(card1);
		}
	}
	return Cards;
	}
	
	//shuffle method (randomizes the order of the cards)
	public List<Card> shuffle() {
		Collections.shuffle(Cards);
		return Cards;
	}
	
	//draw method (removes and returns the top card of the Cards field)
	public Card draw() {
		
	Card draw = Cards.remove(0);
	
	return draw;
	
	}
	
	
	
	
	
	
	
}

