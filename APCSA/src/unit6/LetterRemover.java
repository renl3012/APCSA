package unit6;

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = " ";
		lookFor = ' ';
	}

	//add in second constructor
	public LetterRemover(String s, char rem){
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
		removeLetters();
		System.out.println(toString());
	}

	public String removeLetters()
	{
		String cleaned = sentence;
		int loc = cleaned.indexOf(lookFor);

		while (cleaned.indexOf(lookFor) > -1){
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc+1,cleaned.length());
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}