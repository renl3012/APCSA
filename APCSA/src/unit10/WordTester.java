package unit10;

import static java.lang.System.*;

public class WordTester
{
	public static void main(String[] args)
	{
		//add test cases
		
		Word word1 = new Word("chicken");
		System.out.println(word1);
		
		//add more test cases
		
		word1.setWord("alligator");
		System.out.println(word1);
		
		word1.setWord("elephant");
		System.out.println(word1);
		
		
	}
}