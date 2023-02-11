package weekSixFinalProject;

public class App {

	public static void main(String[] args) {
		
		//Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck newDeck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		newDeck.shuffle();
		
		
		//Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.playerDraw(newDeck);
			}
			else {
				player2.playerDraw(newDeck);
			}
		}
		
		//Using a traditional for loop, iterate 26 times and call the flip method for each player.
		//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
		
		
		System.out.println("lets play war!");
		for (int j = 0; j < 26; j++) {

			System.out.println("round: " + j);
			
			Card p1Card = player1.flip();
			System.out.print("player1, you drew: ");
			p1Card.describeCard();
			
			Card p2Card = player2.flip();
			System.out.print("player2, you drew: ");
			p2Card.describeCard();
			
			int p1CardValue = p1Card.getvalue();
			int p2CardValue = p2Card.getvalue();
			
			if (p1CardValue > p2CardValue) {
				player1.incrementScore();
				System.out.println("player1 wins this round!");
				
			}
			if (p2CardValue > p1CardValue) {
				player2.incrementScore();
				System.out.println("player2 wins this round!");
				
			}
			if (p1CardValue == p2CardValue) {
				System.out.println("this round is a draw");
			
		}
			System.out.println("player1 score: " + player1.score + "." + " player2 score: " + player2.score + ".");
			System.out.println();
		}
		
		//After the loop, compare the final score from each player. 
		int player1FinalScore = player1.score;
		int player2FinalScore = player2.score;
		
		
		if (player1FinalScore > player2FinalScore) {
			System.out.println("FINAL SCORE: ");
			System.out.println("player1: " + player1FinalScore);
			System.out.println("player2: " + player2FinalScore);
			System.out.println("player 1 wins!");
		}
		if (player2FinalScore > player1FinalScore) {
			System.out.println("FINAL SCORE: ");
			System.out.println("player1: " + player1FinalScore);
			System.out.println("player2: " + player2FinalScore);
			System.out.println("player 2 wins!");
		}
		if (player1FinalScore ==  player2FinalScore) {
			System.out.println("FINAL SCORE: ");
			System.out.println("player1: " + player1FinalScore);
			System.out.println("player2: " + player2FinalScore);
			System.out.println("draw!");
		}
			
		
	}

}
