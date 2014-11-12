import java.util.Scanner;
public class BlackJack {
	public Hand hand;
	public Deck deck;
	
	public static void main(String[] args) {
		int score = 100; // implement this later
		String d = "";
		boolean play = true;
		Scanner keyboard = new Scanner(System.in);
		//Starting new game
		System.out.println("Welcome to Blackjack!");
		Deck deck = new Deck();
		deck.createDeck();
		while (play)
		{
			System.out.println("Dealing hand...\n");
			Hand hand = new Hand();
			deck.dealHand(hand);
			// Each round
			while (hand.calculateValue() < 21 && (!d.equals("stay")) )
			{
				System.out.println("You currently have: ");
				hand.printContents();
				System.out.print("What is your move?: ");
				if(hand.isBlackJack())
					break;
				d = keyboard.nextLine();
				
				if (d.equalsIgnoreCase("hit"))
					deck.hit(hand);
				else if (d.equalsIgnoreCase("stay"));
				// add more later
				else
					System.out.println("That is not a valid input.");

			}
			if(hand.isBlackJack())
			{
				System.out.println("\nCongratulations, you have blackjack!"
						+ "play again? (y/n)" );
				d = keyboard.nextLine();
				if (d.equalsIgnoreCase("y"))
				{
					deck.shuffle();
					continue;
				}
				else
					play = false;
			}
			else if ((hand.calculateValue() == 21) && (!hand.isBlackJack()))
			{
				System.out.println("\nYour final hand was:");
				hand.printContents();
				System.out.printf("Your round score is 100. Play again?: (y/n) >>");
				d = keyboard.nextLine();
				if (d.equalsIgnoreCase("y"))
				{
					deck.shuffle();
					continue;
				}
				else
					play = false;
			}
			else
			{
				String conditional;
				System.out.println("\nYour final hand was:");
				hand.printContents();
				System.out.printf("Your round score is %d, and \n"
						+ "you were %d points %s blackjack!\n"
						+ "Play again? (y/n) >>", 
						(100 - Math.abs((21-hand.calculateValue()))), 
						(Math.abs(21- hand.calculateValue())),
						(conditional = (hand.calculateValue() > 21) 
						? "over" : "under" ));
				d = keyboard.nextLine();
				if (d.equalsIgnoreCase("y"))
				{
					deck.shuffle();
					continue;
				}
				else
					play = false;
			}
		}
		System.out.println("Thanks for playing!");
		keyboard.close();

	}
	
	

}
