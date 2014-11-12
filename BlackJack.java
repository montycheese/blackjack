import java.util.Scanner;
public class BlackJack {
	
	public static void main(String[] args) {
		int score = 100,
			round = 0; // implement round system later
		String d = "";
		boolean invalidInput = true, playing = true;
		Scanner keyboard = new Scanner(System.in);
		//Starting new game
		System.out.println("Welcome to Blackjack!");
		Deck deck = new Deck();
		deck.createDeck();
		while (playing && score > 0)
		{
			System.out.println("Dealing hand...\n");
			Hand hand = new Hand();
			deck.dealHand(hand);
			// Each round
			while (hand.calculateValue() < 21 && (!d.equals("stay")) )
			{
				System.out.println("You currently have: ");
				hand.printContents();
				
				if(hand.isBlackJack())
					break;
				
				System.out.printf("Your hand's value: %d\n", hand.calculateValue());
				System.out.print("What is your move? (hit/stay): ");
				d = keyboard.nextLine();
				
				while(invalidInput) // Check for malformed input
				if (d.equalsIgnoreCase("hit"))
				{	
					deck.hit(hand);
					invalidInput = false;
				}
				else if (d.equalsIgnoreCase("stay"))
					invalidInput = false;
				else
				{
					System.out.println("That is not a valid input.");
					System.out.print("What is your move? (hit/stay): ");
				}
			invalidInput = true; // reset for next round
			}
			if(hand.isBlackJack())
			{
				System.out.println("\nCurrent score: " + score
						+ "\nCongratulations, you have blackjack!"
						+ "play again? (y/n)" );
				d = keyboard.nextLine();
				if (d.equalsIgnoreCase("y"))
				{
					hand.clearHand();
					deck.shuffle();
					continue;
				}
				else
					playing = false;
			}
			else if ((hand.calculateValue() == 21) && (!hand.isBlackJack()))
			{
				System.out.println("\nYour final hand was:");
				hand.printContents();
				System.out.printf("Current Score %d. Play again?: (y/n) >>", score);
				d = keyboard.nextLine();
				if (d.equalsIgnoreCase("y"))
				{
					hand.clearHand();
					deck.shuffle();
					continue;
				}
				else
					playing = false;
			}
			else
			{
				score -= (hand.calculateValue() > 21) 
						 ? hand.calculateValue()
						 : 21 - hand.calculateValue();
				String conditional;
				System.out.println("Final hand's value: " + hand.calculateValue());
				System.out.println("\nYour final hand was:");
				hand.printContents();
				
				System.out.printf("Current score is %d, and \n"
						+ "you were %d points %s blackjack!\n"
						+ "Play again? (y/n) >>", 
						score, 
						(Math.abs(21- hand.calculateValue())),
						(conditional = (hand.calculateValue() > 21) 
						? "over" : "under" ));
				d = keyboard.nextLine();
				if (d.equalsIgnoreCase("y"))
				{
					hand.clearHand();
					deck.shuffle();
					continue;
				}
				else
					playing = false;
			}
		}
		if (score <= 0)
		{
			System.out.printf("Final score: %d\n", score);
			System.out.println("Your score dropped below 1, you lose!\n"
								+ "Sorry, play again!");
		}
		else
		{
			System.out.println("Thanks for playing!");
			System.out.printf("Final score: %d", score);
			keyboard.close();
		}
	}
}
