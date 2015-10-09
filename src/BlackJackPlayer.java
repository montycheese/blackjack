
public class BlackJackPlayer extends Player {
	private Hand<BlackJackCard> hand;
	
	
	public BlackJackPlayer(double initialCash, int id){
		super(initialCash, id);
		hand = new Hand<>();
	}
	
	
	public Hand<BlackJackCard> getHand(){
		return this.hand;
	}

}
