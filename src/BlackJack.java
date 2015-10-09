import java.util.ArrayList;
import java.util.Scanner;
public class BlackJack implements Game {
	private static final double STARTING_CASH = 500.0;
	private int numPlayers = 0;
	private BlackJackDealer dealer;
	private ArrayList<BlackJackPlayer> players;
	private BlackJackDeck<BlackJackCard> deck;
	
	
	public BlackJack(int numPlayers){
		this.numPlayers = numPlayers;
		players = new ArrayList<BlackJackPlayer>(numPlayers);
		for(int i=0;i<numPlayers;i++){
			players.add(new BlackJackPlayer(STARTING_CASH, i+1));
		}
		dealer = new BlackJackDealer();
		deck = new BlackJackDeck<BlackJackCard>();
	}
	
	public void play(){
		
	}
	public int getNumPlayers(){
		return this.numPlayers;
	}
	public void end(){
		System.out.println("Game over");
	}
	public void deal(){
		for(int i =0; i < 2;i++){
			for(BlackJackPlayer p: players){
				p.getHand().add(deck.pop());
			}
			dealer.getHand().add(deck.pop());
		}
	}
	
	
}
