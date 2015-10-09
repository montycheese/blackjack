import java.util.Stack;

public abstract class Deck<T extends Card> {
	private int maxSize;
	protected Stack<T> deck;

	public Deck(int maxSize){
		this.maxSize = maxSize;
	}
	
	public int getSize(){
		return deck.size();
	}
	public boolean isEmpty(){
		return deck.empty();
	}
	
	public void shuffle(){};
	
	protected abstract void create();
	
	protected void clear(){
		while(!deck.empty()){
			deck.pop();
		}
	}
	
	public T pop(){
		return deck.pop();
	}

}
