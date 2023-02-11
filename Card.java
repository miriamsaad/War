package weekSixFinalProject;

public class Card {
	
		
		//value field (contains a value from 2-14 representing cards 2-Ace)
		public int value;
		
	
		//name field (e.g. Ace of Diamonds, or Two of Hearts)
		public String name;
		
		
		//constructor
		public Card(int value, String name) {
			this.value = value;
			this.name = name;
				
		}
		
		//getters and setters
		
		public int getvalue() {
			return value;
		}


		public void setvalue(int value) {
			this.value = value;
			
		}
		
		public String getname() {
			return name;
		}


		public void setname(String name) {
			this.name = name;
			
		}
		
		//method describe (prints out information about a card)
		public void describeCard() { 
			System.out.println(value + " of " + name);
			
		}
		
		                                     
	
	}


	
	



