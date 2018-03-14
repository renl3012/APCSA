package unit12;

import static java.lang.System.*;

import java.util.Arrays;

public class Word implements Comparable<Word>
{
	private String word;
	private Word otherWord;
	private String[] ordered;
	private int number;

	public Word(String s)
	{
		word = s;

	}

	public int compareTo( Word rhs ){
		otherWord = rhs;
		int result = 0;
		for (int i = 0; i < word.length() && i < (otherWord.toString()).length(); i++) {
			if ((int)word.charAt(i) == (int)otherWord.toString().charAt(i)) {
					continue;
			}
			else if (word.length() == otherWord.toString().length()){
				result = (int)word.charAt(i) - (int)otherWord.toString().charAt(i);
				return result;
			}
			else if(word.length() > (otherWord.toString()).length()){
				return 1;
			}
			
			else if(word.length() < (otherWord.toString()).length()){
				return -1;
			}
		}
		return 0;
	}
	
	public String toString()
	{
		return word;
	}
}