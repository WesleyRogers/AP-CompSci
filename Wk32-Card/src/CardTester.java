/**
 * This is a class that tests the Card class.
 */

/*
    Lab 3 Cards
    Wesley Rogers 
    4/11/16
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Test a couple of things about the card class.

    What I learned: Not much.
    
    Difficulties: None.
*/
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("Ace", "Spades", 1);
		Card b = new Card("Queen", "Spades", 10);
		Card c = new Card("Two", "Diamonds", 2);
		System.out.println(c.toString()); //Checks toString.
		System.out.println(a.matches(b)); //Should return false. Equality check.
		System.out.println(b.suit() + " " + b.rank() + " " + b.pointValue()); //Accessors
		
	}
}
/*
Two of Diamonds (point value = 2)
false
Spades Queen 10

*/