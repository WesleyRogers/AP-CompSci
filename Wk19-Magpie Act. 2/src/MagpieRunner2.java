import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
/*
    Magpie Activity 2
    Edited by Wesley Rogers 
    1/15/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    What I learned: Not much.
    
    Difficulties: None.
*/
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
		
	}

	//This is shoe-horned in because there is no real reason to have overloading in this magpie lesson, but you required it so...
	//Does nothing.
	public static void useless(){
	    System.out.print("");
	}
	
	//Also does nothing. Also required.
	public static void useless(int a){
	    for(int i=0; i<a; i++){
	        System.out.print("");
	    }
	}
	
}
