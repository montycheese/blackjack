public class Hand extends Deck {
	private int size = 2;
	private Card[] hand = new Card[11]; 
	// the absolute largest hand one can have in blackjack is 11
	// that is 4 "aces", 4 "two's", and 3 "threes"
	
	public Hand(){
		this.hand[0] = null;
		this.hand[1] = null;
	}
	public void setCard(Card aCard){
		if (this.hand[0] != null && this.hand[1] !=null)
		{
			this.hand[size] = aCard;
			size++;
		}
		else if (this.hand[0] != null)
			this.hand[1] = aCard;
		else 
			this.hand[0] = aCard;
	}
	public int calculateValue(){
		int total = 0;
		for (int x = 0; x < size; x++)
			total+= this.hand[x].getValue();
		return total;
	}
	
	public void printContents(){
		for (int x = 0; x < this.size; x++){
			System.out.print(this.hand[x].toString() + " ");
		}
		System.out.println("\n");
	}
	public void clearHand() {
		this.hand = new Card[11];
		this.size = 2;
	}
	public boolean isBlackJack(){
		return ((this.hand[0].getRank().equals("Ace") 
			&& (this.hand[1].getValue() ==10))
			|| ((this.hand[1].getRank().equals("Ace"))
			&& (this.hand[0].getValue() == 10)) 
			&& (this.size == 2));
	}
}
