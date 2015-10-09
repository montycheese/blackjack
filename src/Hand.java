import java.util.ArrayList;

public class Hand<T extends Card> {
	private ArrayList<T> cards;
	
	public Hand(){
		this.cards = new ArrayList<T>(2);
	}
	
	public void add(T card){
		cards.add(card);
	}
	

}
