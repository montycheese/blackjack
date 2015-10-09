
public class BlackJackCard extends Card{
	private Suit suit;
	private Rank rank;
	
	public BlackJackCard(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	
	public void setRank(Rank rank){
		this.rank = rank;
	}
	public void setSuit(Suit suit){
		this.suit = suit;
	}

	public Rank getRank() {
		return this.rank;
	}
	public Suit getSuit(){
		return this.suit;
	}

}
