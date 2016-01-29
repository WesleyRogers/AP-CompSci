// EWW TABS.
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
/* Edited by Wesley Rogers */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.toLowerCase().indexOf("no") >= 0) //Changed
		{
			response = "No is a weird word.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0)
		{
			response = "Tell me more about your family, they seem nice.";
		}
		else if(statement.indexOf("sister") >= 0){
		    response = "I don't have a sister.";
		}
		else if (statement.indexOf("brother") >= 0){ //Changed
		    response = "I have a brother.";
		}
		else if (statement.toLowerCase().indexOf("dog") >= 0 //Added
		        || statement.toLowerCase().indexOf("cat") >= 0){
		    response = "Tell me more about your cat.";
		}
		else if (statement.toLowerCase().indexOf("mr. zaengle") >= 0 //Added
		        || statement.toLowerCase().indexOf("dr. fisher") >= 0){
		    response = "They seem pretty cool.";
		}
		else if(statement.toLowerCase().trim().length() == 0){ //Added
		    response = "Please enter something of substance, I can't survive on whitespace alone.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4){ //Added
		    response = "To be honest, I have no idea how to respond to that. Sorry!";
		}
		else if (whichResponse == 5){ //Added
		    response = "... I'm lost.";
		}
		
		return response;
	}
}
