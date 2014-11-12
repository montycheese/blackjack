public class Card {
	private String suit;
	private String rank;
	private static final String[] allSuits = {
		"Hearts", "Spades", "Diamonds", "Clubs"
		};
	private static final String[] allRanks = { 
		null, "Ace", "Two", "Three", "Four", "Five",
		"Six", "Seven", "Eight", "Nine", "Ten", "Jack", 
		"Queen", "King"
		};
	
	
	public Card (){
		//generateCard();
		this.suit = null;
		this.rank = null;
	}
	/** Create random card attributes with each new instance 
	 * Unused method for blackjack*/
	private void generateCard() {
		this.suit = allSuits[(int)Math.round(Math.random()*3)]; 
		this.rank = allRanks[(int)Math.round(Math.random()*12 +1)];
	}
	public void setRank(String rank){
		this.rank = rank;
	}
	public void setSuit(String suit){
		this.suit = suit;
	}
	public int getValue(){
		if (this.rank.equalsIgnoreCase("Ace"))
			return 1;
		else if(this.rank.equalsIgnoreCase("Two"))
			return 2;
		else if (this.rank.equalsIgnoreCase("Three"))
			return 3;
		else if (this.rank.equalsIgnoreCase("Four"))
			return 4;
		else if (this.rank.equalsIgnoreCase("Five"))
			return 5;
		else if (this.rank.equalsIgnoreCase("Six"))
			return 6;
		else if (this.rank.equalsIgnoreCase("Seven"))
			return 7;
		else if (this.rank.equalsIgnoreCase("Eight"))
			return 8;
		else if (this.rank.equalsIgnoreCase("Nine"))
			return 9;
		else if (this.rank.equalsIgnoreCase("Ten"))
			return 10;
		else if (this.rank.equalsIgnoreCase("Jack"))
			return 10;
		else if (this.rank.equalsIgnoreCase("Queen"))
			return 10;
		else if (this.rank.equalsIgnoreCase("King"))
			return 10;
		else
		{
			System.out.println("Error occured");
			System.exit(0);
			return 666;
		}
			
	}
	public String getRank() {
		return this.rank;
	}
	public String getSuit(){
		return this.suit;
	}
	/** unused method for blackjack */
	public boolean isHigher(Card anotherCard) {
		int rank1 = 0, rank2 = 0;
		for (int x =0; x < this.allRanks.length; x++)
		{
			if (this.rank == this.allRanks[x])
				rank1 = x;
			else if (anotherCard.getRank() == this.allRanks[x])
				rank2 = x;
		}
		if (rank1 == 0 && rank2 == 0)
		{
			System.out.println("Error");
			System.exit(0);
		}
		return (rank1 > rank2);
	}
	/** unused method for blackjack */
	public boolean equals(Card anotherCard){
		return (this.rank.equals(anotherCard.getRank())
				&& this.suit.equals(anotherCard.getSuit())
				);
	}
	public String toString(){
		return String.format("%s of %s'", this.rank, this.suit);
	}
}
