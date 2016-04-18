/**
 * This is a class that tests the Deck class.
 */

/*
    Week 32 Shuffle Deck
    Wesley Rogers 
    4/15/16
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Tests out the various functions of the Deck class.

    What I learned: Not much, I just ported most of the code between data types.
    
    Difficulties: None.
*/
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		/* My stuff */
		String[] suitsb = {"hearts", "spades", "clubs", "diamonds"};
        String[] rankb = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
        int[] ptValsb = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        Deck c = new Deck(rankb, suitsb, ptValsb); //Create a 25 card deck.
        
        System.out.println(" **** 52 Card Deck after being shuffled ****");
        c.shuffle();
        System.out.println(c);
        
        System.out.println("**** 52 Card deck after being shuffled three times. ****");
        c.shuffle();
        c.shuffle();
        c.shuffle();
        System.out.println(c);
	}
}
/*
**** Original Deck Methods ****
  toString:
size = 6
Undealt cards: 
jack of blue (point value = 11), king of red (point value = 13), 
king of blue (point value = 13), queen of red (point value = 12), 
queen of blue (point value = 12), jack of red (point value = 11)

Dealt cards: 


  isEmpty: false
  size: 6


**** Deal a Card ****
  deal: jack of blue (point value = 11)


**** Deck Methods After 1 Card Dealt ****
  toString:
size = 5
Undealt cards: 
king of red (point value = 13), king of blue (point value = 13), 
queen of red (point value = 12), queen of blue (point value = 12), 
jack of red (point value = 11)
Dealt cards: 
jack of blue (point value = 11)

  isEmpty: false
  size: 5


**** Deal Remaining 5 Cards ****
  deal: king of red (point value = 13)
  deal: king of blue (point value = 13)
  deal: queen of red (point value = 12)
  deal: queen of blue (point value = 12)
  deal: jack of red (point value = 11)


**** Deck Methods After All Cards Dealt ****
  toString:
size = 0
Undealt cards: 

Dealt cards: 
jack of blue (point value = 11), king of red (point value = 13), 
king of blue (point value = 13), queen of red (point value = 12), 
queen of blue (point value = 12), jack of red (point value = 11)


  isEmpty: true
  size: 0


**** Deal a Card From Empty Deck ****
  deal: null


 **** 52 Card Deck after being shuffled ****
size = 52
Undealt cards: 
nine of hearts (point value = 9), ten of diamonds (point value = 10), 
king of diamonds (point value = 10), jack of clubs (point value = 10), 
seven of clubs (point value = 7), ten of clubs (point value = 10), 
two of spades (point value = 2), five of hearts (point value = 5), 
seven of diamonds (point value = 7), ace of diamonds (point value = 11), 
two of hearts (point value = 2), king of hearts (point value = 10), 
nine of diamonds (point value = 9), king of clubs (point value = 10), 
queen of diamonds (point value = 10), six of hearts (point value = 6), 
ace of clubs (point value = 11), eight of hearts (point value = 8), 
five of diamonds (point value = 5), jack of diamonds (point value = 10), 
five of spades (point value = 5), four of hearts (point value = 4), 
nine of spades (point value = 9), six of clubs (point value = 6), 
ace of spades (point value = 11), two of clubs (point value = 2), 
eight of spades (point value = 8), ten of spades (point value = 10), 
three of diamonds (point value = 3), five of clubs (point value = 5), 
nine of clubs (point value = 9), eight of clubs (point value = 8), 
queen of hearts (point value = 10), queen of spades (point value = 10), 
four of clubs (point value = 4), queen of clubs (point value = 10), 
ace of hearts (point value = 11), three of clubs (point value = 3), 
four of spades (point value = 4), eight of diamonds (point value = 8), 
six of diamonds (point value = 6), seven of hearts (point value = 7), 
king of spades (point value = 10), six of spades (point value = 6), 
jack of hearts (point value = 10), four of diamonds (point value = 4), 
two of diamonds (point value = 2), ten of hearts (point value = 10), 
three of spades (point value = 3), three of hearts (point value = 3), 
jack of spades (point value = 10), seven of spades (point value = 7)

Dealt cards: 


**** 52 Card deck after being shuffled three times. ****
size = 52
Undealt cards: 
two of spades (point value = 2), ace of diamonds (point value = 11), 
seven of hearts (point value = 7), four of clubs (point value = 4), 
ten of hearts (point value = 10), ace of clubs (point value = 11), 
nine of diamonds (point value = 9), three of spades (point value = 3), 
eight of diamonds (point value = 8), four of hearts (point value = 4), 
jack of diamonds (point value = 10), seven of spades (point value = 7), 
ace of spades (point value = 11), two of diamonds (point value = 2), 
queen of clubs (point value = 10), four of spades (point value = 4), 
seven of diamonds (point value = 7), queen of diamonds (point value = 10), 
five of hearts (point value = 5), two of clubs (point value = 2), 
king of diamonds (point value = 10), ten of diamonds (point value = 10), 
nine of spades (point value = 9), five of spades (point value = 5), 
five of clubs (point value = 5), six of clubs (point value = 6), 
six of spades (point value = 6), nine of hearts (point value = 9), 
queen of spades (point value = 10), queen of hearts (point value = 10), 
jack of clubs (point value = 10), eight of hearts (point value = 8), 
eight of clubs (point value = 8), king of spades (point value = 10), 
three of diamonds (point value = 3), nine of clubs (point value = 9), 
three of hearts (point value = 3), ten of clubs (point value = 10), 
five of diamonds (point value = 5), king of hearts (point value = 10), 
eight of spades (point value = 8), two of hearts (point value = 2), 
six of diamonds (point value = 6), ace of hearts (point value = 11), 
four of diamonds (point value = 4), king of clubs (point value = 10), 
three of clubs (point value = 3), seven of clubs (point value = 7), 
jack of spades (point value = 10), jack of hearts (point value = 10), 
six of hearts (point value = 6), ten of spades (point value = 10)

Dealt cards: 


*/