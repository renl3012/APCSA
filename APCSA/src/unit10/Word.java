package unit10;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
	private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		word = "";
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
		toString();
	}
	
	public int getNumVowels()
	{
		int count=0;

		for (int i = 0; i < word.length(); i++){
			if (vowels.indexOf(word.charAt(i)) >= 0){
				count++;
			}
		}
		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
		String output = word + "\nnum vowels == " + getNumVowels() + "\nnum chars == " + getLength() + "\n";
		return output;
	}
}