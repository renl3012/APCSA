package unit12;

import static java.lang.System.*;

public class WordE implements Comparable<WordE>
{
	private String word;
	private WordE otherWord;

	public WordE(String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;

		for (int i = 0; i < word.length(); i++){
			if (vowels.indexOf(word.charAt(i)) > -1){
				vowelCount += 1;
			}
		}


		return vowelCount;
	}

	public int compareTo(WordE rhs)
	{
		otherWord = rhs;
		int result = 0;
		for (int i = 0; i < word.length() || i < (otherWord.toString()).length(); i++) {
			if (numVowels() < otherWord.numVowels()) {
				return -1;
			}
			else if(numVowels() > otherWord.numVowels()){
				return 1;
			}else{
				result = (int)word.charAt(i) - (int)otherWord.toString().charAt(i);
				if (result != 0){
					return result;
				}
			}	
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}
