
public class BlackJackDeck<T extends Card> extends Deck<T> {
	private static final int MAX_SIZE = 52;
	
	public BlackJackDeck() {
		super(MAX_SIZE);
		create();
	}
	@Override
	protected void create() {
		clear();
		
	}
	
	public void shuffle(){
		create();
	}
	

}
