public class Player {
	private int id;
	private Hand<Card> hand;
	private double cash;
	
	public Player(double initialCash, int id){
		this.cash = initialCash;
		this.id = id;
		hand = new Hand<>();
	}
	
	@Override
	public String toString(){
		return String.format("Player: %d", id);
	}
	
}
