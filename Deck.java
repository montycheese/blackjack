
public class Deck {
	private int size = 52;
	private Card[] deck = new Card[52];
	private static final String[] allSuits = {
		"Hearts", "Spades", "Diamonds", "Clubs" };
	private static final String[] allRanks = { 
		null, "Ace", "Two", "Three", "Four", "Five",
		"Six", "Seven", "Eight", "Nine", "Ten", "Jack", 
		"Queen", "King"
		};
	
	public Deck(){
		createDeck();
	}
	
	public void createDeck(){
		int count = 0;
		for (int x = 1; x < 14; x++)
		{
			for (int y = 0; y < 4; y++)
			{
				Card card = new Card();
				card.setRank(allRanks[x]);
				card.setSuit(allSuits[y]);
				deck[count] = card;
				count++;
			}
		}
	}
	/** exactly the same as createDeck */
	public void shuffle() {
		int count = 0;
		for (int x = 1; x < 14; x++)
		{
			for (int y = 0; y < 4; y++)
			{
				Card card = new Card();
				card.setRank(allRanks[x]);
				card.setSuit(allSuits[y]);
				deck[count] = card;
				count++;
			}
		}
	}
	
	public void dealHand(Hand aHand) {
		int randomNum = (int)(Math.round(Math.random()*51));
		aHand.setCard(deck[randomNum]);
		deck[randomNum] = null;
		int secondRandomNum = (int)(Math.round(Math.random()*51));
		if (deck[secondRandomNum] == null)
		{
			while (deck[secondRandomNum] == null)
			{
				secondRandomNum = (int)(Math.round(Math.random()*51));
				if (deck[secondRandomNum] != null)
				{
					aHand.setCard(deck[secondRandomNum]);
					deck[secondRandomNum] = null;
				}
			}
		}
		else
		{
			aHand.setCard(deck[secondRandomNum]); 
			deck[secondRandomNum] = null;
		}
	}
	public void hit(Hand aHand) {
		int randomNum = (int)(Math.round(Math.random()*51));
		if (deck[randomNum] == null)
		{
			while (deck[randomNum] == null)
			{
				randomNum = (int)(Math.round(Math.random()*51));
				if (deck[randomNum] != null)
				{
					aHand.setCard(deck[randomNum]);
					deck[randomNum] = null;
				}
			}
		}
		else
		{
			aHand.setCard(deck[randomNum]);
			deck[randomNum] = null;
		}
	}
	public void printContents(){
		for (int x = 0; x < this.size; x++){
			System.out.println(this.deck[x].toString());
		}
	}

}
