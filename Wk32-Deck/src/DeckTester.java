/**
 * This is a class that tests the Deck class.
 */

/*
    Deck Lab
    Wesley Rogers 
    4/11/16
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Tests a deck and checks to make sure several things are true.
    
    What I learned: Not much, but I do need to remember to actually initialize something before I use it.
    
    Difficulties: I was attempting to use cards in the Deck class before I initialized it. Whoops!
*/
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    String[] suitsA = {"red", "blue"};
	    String[] rankA = {"jack", "queen", "king"};
	    int[] ptValsA = {11, 12, 13};
	    
	    String[] suitsB = {"red", "blue"};
	    String[] rankB = {"jack", "queen", "king"};
	    int[] ptValsB = {11, 12, 13};
	    
	    String[] suitsC = {"hearts", "spades", "clubs", "diamonds"};
	    String[] rankC = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
	    int[] ptValsC = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	    
		Deck a = new Deck(rankA, suitsA, ptValsA);
		Deck b = new Deck(rankB, suitsB, ptValsB);
		Deck c = new Deck(rankC, suitsC, ptValsC); //An actual 52 card deck.
		
		System.out.println("Deck A and Deck B draw the same card first? " + a.deal().matches(b.deal()));
		System.out.println("Are any decks empty? " + (a.isEmpty() | b.isEmpty() | c.isEmpty()));
		System.out.println("Deck C has 52 cards? " + (c.size()==52) + '\n');
		System.out.println(a + "\n");
		
		System.out.println(c);
	}
}
/*
Deck A and Deck B draw the same card first? true
Are any decks empty? false
Deck C has 52 cards? true

size = 5
Undealt cards: 
king of red (point value = 13), queen of blue (point value = 12), 
queen of red (point value = 12), jack of blue (point value = 11), 
jack of red (point value = 11)
Dealt cards: 
king of blue (point value = 13)


size = 52
Undealt cards: 
ace of diamonds (point value = 11), ace of clubs (point value = 11), 
ace of spades (point value = 11), ace of hearts (point value = 11), 
king of diamonds (point value = 10), king of clubs (point value = 10), 
king of spades (point value = 10), king of hearts (point value = 10), 
queen of diamonds (point value = 10), queen of clubs (point value = 10), 
queen of spades (point value = 10), queen of hearts (point value = 10), 
jack of diamonds (point value = 10), jack of clubs (point value = 10), 
jack of spades (point value = 10), jack of hearts (point value = 10), 
ten of diamonds (point value = 10), ten of clubs (point value = 10), 
ten of spades (point value = 10), ten of hearts (point value = 10), 
nine of diamonds (point value = 9), nine of clubs (point value = 9), 
nine of spades (point value = 9), nine of hearts (point value = 9), 
eight of diamonds (point value = 8), eight of clubs (point value = 8), 
eight of spades (point value = 8), eight of hearts (point value = 8), 
seven of diamonds (point value = 7), seven of clubs (point value = 7), 
seven of spades (point value = 7), seven of hearts (point value = 7), 
six of diamonds (point value = 6), six of clubs (point value = 6), 
six of spades (point value = 6), six of hearts (point value = 6), 
five of diamonds (point value = 5), five of clubs (point value = 5), 
five of spades (point value = 5), five of hearts (point value = 5), 
four of diamonds (point value = 4), four of clubs (point value = 4), 
four of spades (point value = 4), four of hearts (point value = 4), 
three of diamonds (point value = 3), three of clubs (point value = 3), 
three of spades (point value = 3), three of hearts (point value = 3), 
two of diamonds (point value = 2), two of clubs (point value = 2), 
two of spades (point value = 2), two of hearts (point value = 2)

Dealt cards: 



*/