import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
/*
    Magpie Activity 5
    Edited by Wesley Rogers 
    1/15/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    What I learned: I remembered how to define an entire array at once, I hadforgotten about that.
    
    Difficulties: None.
*/
public class MagpieRunner5
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie5 maggie = new Magpie5();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
