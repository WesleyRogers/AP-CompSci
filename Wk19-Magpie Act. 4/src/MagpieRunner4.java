import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
/*
Edited by Wesley Rogers 
1/15/16
Java 1.8u25, using Eclipse Mars
Windows 7

What I learned: Not much, but I was cool seeing the official solution in Act. 5 vs. what I did. I find mine much more obvious as to what's happening, but I did end up changing more code than the other solution.

Difficulties: None.
*/
public class MagpieRunner4
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
		
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
