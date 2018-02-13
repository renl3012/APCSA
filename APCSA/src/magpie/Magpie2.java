package magpie;

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
		String noSpace = statement.trim();
		if (noSpace.length() < 1){
			response = "Say something, please.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0){
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Remington") >= 0){
			response = "He sounds like a good teacher.";
		}
		else if (statement.indexOf("hello") >= 0){
			response = "Hi!";
		}
		else if (statement.indexOf("haha") >= 0){
			response = "I'm glad you found that funny.";
		}
		else if (statement.indexOf("thanks") >= 0){
			response = "You are very welcome.";
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
		else if (whichResponse == 4)
		{
			response = "Okay, I see.";
		}
		else if (whichResponse == 5)
		{
			response = "Right.";
		}
		return response;
	}
}